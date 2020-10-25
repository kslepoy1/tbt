package com.example.demo.events;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "event_communities")
public class EventCommunities {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "event_id")
    private Integer eventId;

    @Column(name = "community_id")
    private Integer community_id;

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public Integer getCommunity_id() {
		return community_id;
	}

	public void setCommunity_id(Integer community_id) {
		this.community_id = community_id;
	}
    
    
    

}
