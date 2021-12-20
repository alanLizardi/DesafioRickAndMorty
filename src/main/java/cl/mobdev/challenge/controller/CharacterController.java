package cl.mobdev.challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.mobdev.challenge.model.response.CharacterAndLocationResponse;
import cl.mobdev.challenge.service.CharacterService;

@RestController
@RequestMapping("/v1")
public class CharacterController {

	@Autowired //inyeccion de dependencia
	private CharacterService service;

	@GetMapping("/character/{id}")
	public CharacterAndLocationResponse getCharacter(@PathVariable(value = "id") String id) {
		CharacterAndLocationResponse character = service.getCharacterById(id);
		return character;
	}
}
