package com.planora.dao;

import com.planora.model.User;
import com.planora.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {

    private static final String INSERT_USER_SQL =
            "INSERT INTO users (name, email, role) VALUES (?, ?, ?)";

    public boolean addUser(User user) {
        boolean rowInserted = false;

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(INSERT_USER_SQL)) {

            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getRole());

            int rows = ps.executeUpdate();
            rowInserted = rows > 0;

        } catch (SQLException e) {
            System.out.println("Error inserting user: " + e.getMessage());
        }

        return rowInserted;
    }
}
