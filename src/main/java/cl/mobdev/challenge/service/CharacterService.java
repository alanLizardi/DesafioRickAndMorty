package cl.mobdev.challenge.service;

import cl.mobdev.challenge.model.response.CharacterAndLocationResponse;

public interface CharacterService {
	
	public CharacterAndLocationResponse getCharacterById(String id);
}
