# 🏨 Hotel Room Booking Console Application

A Java-based Hotel Room Booking Console Application developed using Object-Oriented Programming (OOP) concepts. This project allows users to manage hotel room bookings through a menu-driven console interface.

---

## 📌 Project Overview

The Hotel Room Booking Console Application is designed to simulate a basic hotel booking system. Users can view available rooms, book rooms, cancel bookings, search for bookings, and display all bookings. Booking information is stored in a text file using Java File Handling.

This project demonstrates the implementation of core Java programming concepts and follows a modular package structure.

---

## ✨ Features

- View all hotel rooms
- Book a room
- Cancel an existing booking
- Search booking using Booking ID
- View all bookings
- Calculate total booking bill
- Store booking details in a text file
- Input validation
- Menu-driven console interface

---

## 🛠 Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Collections (ArrayList)
- File Handling
- Exception Handling
- Console Application

---

## 📂 Project Structure

```
HotelRoomBookingConsoleApp
│
├── src
│   ├── app
│   │     Main.java
│   │
│   ├── model
│   │     Booking.java
│   │     Customer.java
│   │     Room.java
│   │
│   ├── service
│   │     HotelService.java
│   │
│   └── util
│         FileManager.java
│
├── data
│     bookings.txt
│
└── README.md
```

---

## 🚀 How to Run

### Compile

```bash
javac app/Main.java
```

### Run

```bash
java app.Main
```

---

## 📋 Menu

```
1. View Rooms
2. Book Room
3. Cancel Booking
4. Search Booking
5. View All Bookings
6. Exit
```

---

## 💻 OOP Concepts Used

- Classes and Objects
- Constructors
- Encapsulation
- Method Calling
- Packages
- Object Composition

---

## 📁 File Handling

Booking details are stored inside:

```
data/bookings.txt
```

Each booking is saved in comma-separated format.

---

## 🔍 Validation

The application validates:

- Empty customer name
- Empty phone number
- Invalid room number
- Already booked rooms
- Invalid booking ID
- Number of days greater than zero

---

## 📚 Learning Outcomes

This project helped in understanding:

- Java Programming
- Object-Oriented Design
- Console Application Development
- Java Collections
- File Handling
- Exception Handling
- Project Structure
- GitHub Project Management

---

## 🚀 Future Enhancements

- Login System
- Admin Dashboard
- Customer Dashboard
- Automatic Loading of Saved Bookings
- Database Integration (MySQL)
- GUI using Java Swing
- Online Payment Simulation

---

## 👨‍💻 Author

**Muskan**

B.Tech Computer Science Engineering

Java Console Project

---