package com.movie.app.entity;

import java.time.LocalDate;
import java.time.LocalTime;
//import java.util.List;
import java.util.Objects;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class Event {
	
	public Event(int eventId, @NotNull(message = "Event Name Cannot be left Blank") String eventName,
			@NotNull(message = "Event Type Cannot be left Blank") String eventType, LocalDate eventDate,
			LocalTime eventTime, @NotNull(message = "Event Language Cannot be left Blank") String eventLanguage) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventType = eventType;
		this.eventDate = eventDate;
		this.eventTime = eventTime;
		this.eventLanguage = eventLanguage;
	}
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private int eventId;
	@NotNull(message = "Event Name Cannot be left Blank")
	private String eventName;
	@NotNull(message = "Event Type Cannot be left Blank")
	private String eventType;

	private LocalDate eventDate;	
	private LocalTime eventTime;
	
	@NotNull(message = "Event Language Cannot be left Blank")
	private String eventLanguage;
	/*private List<String> eventLocations;
	private double eventRating;*/
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
	public LocalDate getEventDate() {
		return eventDate;
	}
	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}
	public LocalTime getEventTime() {
		return eventTime;
	}
	public void setEventTime(LocalTime eventTime) {
		this.eventTime = eventTime;
	}
	public String getEventLanguage() {
		return eventLanguage;
	}
	public void setEventLanguage(String eventLanguage) {
		this.eventLanguage = eventLanguage;
	}
	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", eventName=" + eventName + ", eventType=" + eventType + ", eventDate="
				+ eventDate + ", eventTime=" + eventTime + ", eventLanguage=" + eventLanguage + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(eventDate, eventId, eventLanguage, eventName, eventTime, eventType);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		return Objects.equals(eventDate, other.eventDate) && eventId == other.eventId
				&& Objects.equals(eventLanguage, other.eventLanguage) && Objects.equals(eventName, other.eventName)
				&& Objects.equals(eventTime, other.eventTime) && Objects.equals(eventType, other.eventType);
	}
	
	
	
	
	

}
