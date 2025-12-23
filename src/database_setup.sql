-- Planora Event Management System Database Setup
-- Run this script in your MySQL Workbench or Terminal

CREATE DATABASE planora_db;
USE planora_db;

CREATE TABLE users (
    user_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    role ENUM('admin', 'organizer') DEFAULT 'organizer'
);

CREATE TABLE events (
    event_id INT PRIMARY KEY AUTO_INCREMENT,
    event_name VARCHAR(100) NOT NULL,
    event_date DATE NOT NULL,
    location VARCHAR(100) NOT NULL,
    description TEXT
);

CREATE TABLE bookings (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT,
    event_id INT,
    FOREIGN KEY (user_id) REFERENCES users(user_id),
    FOREIGN KEY (event_id) REFERENCES events(event_id)
);

-- Optional: Insert sample data
INSERT INTO users (name, email, role) VALUES ('Admin User', 'admin@planora.com', 'admin');
INSERT INTO users (name, email, role) VALUES ('Test User', 'testuser@example.com', 'organizer');

INSERT INTO events (event_name, event_date, location, description) 
VALUES ('Planora Launch Event', '2025-01-15', 'Online', 'Initial launch event for Planora system');
