package com.planora.main;

import com.planora.dao.UserDAO;
import com.planora.dao.EventDAO;
import com.planora.model.User;
import com.planora.model.Event;

import java.sql.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        UserDAO userDAO = new UserDAO();
        EventDAO eventDAO = new EventDAO();

        // Dummy User
        User dummyUser = new User(
                "Test User",
                "testuser@example.com",
                "organizer"
        );

        boolean userSaved = userDAO.addUser(dummyUser);

        // Dummy Event
        Event dummyEvent = new Event(
                "Planora Launch Event",
                Date.valueOf("2025-01-15"),
                "Online",
                "Initial launch event for Planora system"
        );

        boolean eventSaved = eventDAO.addEvent(dummyEvent);

        if (userSaved && eventSaved) {
            System.out.println("Project successfully connected and data saved!");
        } else {
            System.out.println("Something went wrong while saving data.");
        }

        // Optional: display all events to verify retrieval
        List<Event> events = eventDAO.getAllEvents();
        System.out.println("Events in database:");
        for (Event e : events) {
            System.out.println(e.getEventId() + " - " +
                    e.getEventName() + " on " + e.getEventDate());
        }
    }
}
