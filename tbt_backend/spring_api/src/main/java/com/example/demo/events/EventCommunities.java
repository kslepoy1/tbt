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
	private Integer id;
	
    @Column(name = "event_id")
    private Integer eventId;

    @Column(name = "community_id")
    private Integer communityId;

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public Integer getCommunityId() {
		return communityId;
	}

	public void setCommunityId(Integer communityId) {
		this.communityId = communityId;
	}

	
    
    
    

}
