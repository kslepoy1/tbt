package com.example.demo.events;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EventService {
	
	@Autowired EventRepository repo;

	@Autowired EventCommunityRepository ecrepo;
	
	public List<Event> getEvents(EventRequest entity) {

		List<Event> list = repo.findBySchoolAndCommunities(entity.getSchool(), entity.getCommunities() );
		return list;

	}
	
	public Event postEvent(PostEvent entity) {
		Event event = new Event();
		event.setLocation(entity.getLocation());
		event.setPostedBy(entity.getPostedBy());
		event.setSchool(entity.getSchool());
		event.setTime(entity.getTime());
		event.setTitle(entity.getTitle());
		Event s = repo.save(event);
		for (Integer community: entity.getCommunities()) {
			EventCommunities e = new EventCommunities();
			e.setCommunityId(community);
			e.setEventId(s.getId());
			ecrepo.save(e);
		}
		return s;
	}
	
	public void deleteEntity(Integer id) {
		repo.deleteById(id);
	}
}