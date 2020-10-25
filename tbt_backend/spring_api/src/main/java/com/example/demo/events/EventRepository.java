package com.example.demo.events;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface EventRepository extends JpaRepository<Event, Integer> {

	@Query(
			value = "select e from Event e, EventCommunities ec "
			+ " where e.school = :school "
			+ " and ec.eventId = e.id and "
			+ " ec.communityId IN :communities")
	public List<Event> findBySchoolAndCommunities(@Param("school")String school, @Param("communities") Collection<Integer> communities);
	
}
