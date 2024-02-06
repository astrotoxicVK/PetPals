package com.entity;

import java.util.Date;

public class AdoptionEvent {
	private int eventId;
	private String eventName;
	private Date eventDate;
	
	public AdoptionEvent() {}
	public AdoptionEvent(int eventId, String eventName, Date eventDate) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventDate = eventDate;
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public Date getEventDate() {
		return eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	
	
}

