package com.example.demo.events;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/v1/api/events")
public class EventController {


	@Autowired
	private EventService service;

	@GetMapping(path="/" , produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Event>> getAll(@RequestBody EventRequest entity) {
		List<Event> entities = service.getEvents(entity);
		return new ResponseEntity<>(entities, HttpStatus.OK);
	}
	
	//--------------------------------------------------------------------------------------------------------	

	@PostMapping(path="/" , produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Event> postEntity(@RequestBody PostEvent entity) {
		Event saved = service.postEvent(entity);
		return new ResponseEntity<>(saved, HttpStatus.CREATED);
	}
	
	//--------------------------------------------------------------------------------------------------------	

	@PostMapping(path="/delete/{id}" , produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Event> deleteEntity(@PathVariable Integer id) {
		service.deleteEntity(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
