package com.planora.dao;

import com.planora.model.Event;
import com.planora.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EventDAO {

    private static final String INSERT_EVENT_SQL =
            "INSERT INTO events (event_name, event_date, location, description) " +
            "VALUES (?, ?, ?, ?)";

    private static final String SELECT_ALL_EVENTS_SQL =
            "SELECT event_id, event_name, event_date, location, description FROM events";

    public boolean addEvent(Event event) {
        boolean rowInserted = false;

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(INSERT_EVENT_SQL)) {

            ps.setString(1, event.getEventName());
            ps.setDate(2, event.getEventDate());
            ps.setString(3, event.getLocation());
            ps.setString(4, event.getDescription());

            int rows = ps.executeUpdate();
            rowInserted = rows > 0;

        } catch (SQLException e) {
            System.out.println("Error inserting event: " + e.getMessage());
        }

        return rowInserted;
    }

    public List<Event> getAllEvents() {
        List<Event> events = new ArrayList<>();

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(SELECT_ALL_EVENTS_SQL);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Event ev = new Event(
                        rs.getInt("event_id"),
                        rs.getString("event_name"),
                        rs.getDate("event_date"),
                        rs.getString("location"),
                        rs.getString("description")
                );
                events.add(ev);
            }

        } catch (SQLException e) {
            System.out.println("Error fetching events: " + e.getMessage());
        }

        return events;
    }
}
