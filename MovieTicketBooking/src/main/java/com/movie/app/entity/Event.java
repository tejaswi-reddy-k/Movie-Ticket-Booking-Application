package com.movie.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Entity
public class Event {
	private int eventId;
	private String eventName;
	private String eventType;
	private String eventduration;
	private String eventLanguage;
	@Id
	
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
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public String getEventduration() {
		return eventduration;
	}
	public void setEventduration(String eventduration) {
		this.eventduration = eventduration;
	}
	public String getEventLanguage() {
		return eventLanguage;
	}
	public void setEventLanguage(String eventLanguage) {
		this.eventLanguage = eventLanguage;
	}
	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", eventName=" + eventName + ", eventType=" + eventType
				+ ", eventduration=" + eventduration + ", eventLanguage=" + eventLanguage + "]";
	}
	
	

	
}