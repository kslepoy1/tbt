package com.example.demo.events;

import java.util.Collection;
import java.util.List;



public class EventRequest {
	
    private String school;
    
    private Collection<Integer> communities;

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public Collection<Integer> getCommunities() {
		return communities;
	}

	public void setCommunities(List<Integer> communities) {
		this.communities = communities;
	}
    
	
     
}

