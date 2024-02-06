package com.entity;

import com.entity.AdoptionEvent;

public class Participants {
	private int id;
	private AdoptionEvent adoptionEvents;
	private String participantName;
	private String participantEmail;
	
	public Participants() {}
	
	public Participants(int id, AdoptionEvent adoptionEvents, String participantName, String participantEmail) {
		super();
		this.id = id;
		this.adoptionEvents = adoptionEvents;
		this.participantName = participantName;
		this.participantEmail = participantEmail;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public AdoptionEvent getAdoptionEvents() {
		return adoptionEvents;
	}
	public void setAdoptionEvents(AdoptionEvent adoptionEvents) {
		this.adoptionEvents = adoptionEvents;
	}
	public String getParticipantName() {
		return participantName;
	}
	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}
	public String getParticipantEmail() {
		return participantEmail;
	}
	public void setParticipantEmail(String participantEmail) {
		this.participantEmail = participantEmail;
	}
	
	

}

