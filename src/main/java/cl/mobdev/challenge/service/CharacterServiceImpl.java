package cl.mobdev.challenge.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import cl.mobdev.challenge.model.Character;
import cl.mobdev.challenge.model.Location;
import cl.mobdev.challenge.model.OriginAndLocation;
import cl.mobdev.challenge.model.response.CharacterAndLocationResponse;

@Service
public class CharacterServiceImpl implements CharacterService {

	@Value("${url.character}")
	private String urlCharacter;

	@Value("${url.location}")
	private String urlLocation;

	private final RestTemplate restTemplate;

	public CharacterServiceImpl(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public CharacterAndLocationResponse getCharacterById(String id) {

		Character character = restTemplate.getForObject(urlCharacter + id, Character.class);
		Location location = restTemplate.getForObject(character.getLocation().getUrl(), Location.class);
		return characterResponseBuild(character, location);

	}

	private CharacterAndLocationResponse characterResponseBuild(Character character, Location location) {

		CharacterAndLocationResponse resp = new CharacterAndLocationResponse();
		resp.setId(character.getId());
		resp.setName(character.getName());
		resp.setStatus(character.getStatus());
		resp.setSpecies(character.getSpecies());
		resp.setType(character.getType());
		resp.setEpisode_count(character.getEpisode().size());
		resp.setOrigin(originResponseBuild(location));
		return resp;

	}

	private OriginAndLocation originResponseBuild(Location location) {
		OriginAndLocation originAndLocation = new OriginAndLocation();
		originAndLocation.setName(location.getName());
		originAndLocation.setUrl(location.getUrl());
		originAndLocation.setDimension(location.getDimension());
		originAndLocation.setResidents(location.getResidents());
		return originAndLocation;
	}

}
