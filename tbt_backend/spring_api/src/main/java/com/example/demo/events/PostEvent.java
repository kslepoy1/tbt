package com.example.demo.events;

import java.util.Collection;


public class PostEvent {

    private String title;
    
    private String time;
    
    private String location;
    
    private String postedBy;
    
    private String school;
    
    private Collection<Integer> communities;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public Collection<Integer> getCommunities() {
		return communities;
	}

	public void setCommunities(Collection<Integer> communities) {
		this.communities = communities;
	}
    

}