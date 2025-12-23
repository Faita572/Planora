package com.planora.model;

import java.sql.Date;

public class Event {

    private int eventId;
    private String eventName;
    private Date eventDate;
    private String location;
    private String description;

    public Event() {
    }

    public Event(int eventId, String eventName, Date eventDate,
                 String location, String description) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.location = location;
        this.description = description;
    }

    public Event(String eventName, Date eventDate,
                 String location, String description) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.location = location;
        this.description = description;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
