package com.example.demo.events;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface EventRepository extends JpaRepository<Event, Integer> {

	@Query(
			value = "select e from events e, event_communtites ec "
			+ " where e.school = :school "
			+ " and ec.event_id = e.id and "
			+ " ec.community_id IN :communities",
			nativeQuery = true)
	public List<Event> findBySchoolAndCommunities(@Param("school")String school, @Param("communities") Collection<Integer> communities);
	
}
