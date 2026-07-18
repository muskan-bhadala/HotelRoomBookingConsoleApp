package service;

import java.util.ArrayList;
import model.Room;
import java.util.Scanner;
import model.Booking;
import model.Customer;
import util.FileManager;

public class HotelService {

    private ArrayList<Room> rooms;
    private ArrayList<Booking> bookings;
    private Scanner sc = new Scanner(System.in);
private int customerCounter = 1001;

    public HotelService() {

        rooms = new ArrayList<>();
        bookings = new ArrayList<>();

        rooms.add(new Room(101, "Single AC", 2500));
        rooms.add(new Room(102, "Single Non-AC", 1800));
        rooms.add(new Room(103, "Double AC", 3500));
        rooms.add(new Room(104, "Double Non-AC", 2800));
        rooms.add(new Room(105, "Deluxe", 5000));
        rooms.add(new Room(106, "Suite", 8000));
    }

    public void viewRooms() {

        System.out.println("\n========= HOTEL ROOMS =========");

        for (Room room : rooms) {
            room.displayRoom();
        }

        System.out.println("--------------------------------------------");
    }
    public void bookRoom() {

    

    System.out.println("\n========== BOOK ROOM ==========");

    System.out.print("Enter Your Name : ");
    String name = sc.nextLine();

if (name.trim().isEmpty()) {
    System.out.println("Customer name cannot be empty.");
    return;
}

    System.out.print("Enter Phone Number : ");
    String phone = sc.nextLine();

if (phone.isEmpty()) {
    System.out.println("Phone number cannot be empty.");
    return;
}

    System.out.print("Enter Room Number : ");
    int roomNumber = sc.nextInt();

   System.out.print("Enter Number of Days : ");
int days = sc.nextInt();

if (days <= 0) {
    System.out.println("Days must be greater than 0.");
    return;
}

    Room selectedRoom = null;

    for (Room room : rooms) {

        if (room.getRoomNumber() == roomNumber) {
            selectedRoom = room;
            break;
        }
    }

    if (selectedRoom == null) {
        System.out.println("\nRoom does not exist.");
        return;
    }

    if (selectedRoom.isBooked()) {
        System.out.println("\nRoom is already booked.");
        return;
    }

    Customer customer = new Customer(customerCounter++, name, phone);

    Booking booking = new Booking(customer, selectedRoom, days);

    bookings.add(booking);

selectedRoom.setBooked(true);

FileManager.saveBookings(bookings);
    System.out.println("\nBooking Successful!");
    booking.displayBooking();
}
public void viewAllBookings() {

    System.out.println("\n========== ALL BOOKINGS ==========");

    if (bookings.isEmpty()) {
        System.out.println("No bookings found.");
        return;
    }

    for (Booking booking : bookings) {
        booking.displayBooking();
    }
}
public void searchBooking() {

    

    if (bookings.isEmpty()) {
        System.out.println("\nNo bookings available.");
        return;
    }

    System.out.print("\nEnter Booking ID: ");
    String bookingId = sc.nextLine();

    for (Booking booking : bookings) {

        if (booking.getBookingId().equalsIgnoreCase(bookingId)) {

            booking.displayBooking();
            return;
        }
    }

    System.out.println("Booking not found.");
}
public void cancelBooking() {

    

    if (bookings.isEmpty()) {
        System.out.println("\nNo bookings available.");
        return;
    }

    System.out.print("\nEnter Booking ID to cancel: ");
    String bookingId = sc.nextLine();

    for (int i = 0; i < bookings.size(); i++) {

        Booking booking = bookings.get(i);

        if (booking.getBookingId().equalsIgnoreCase(bookingId)) {

            booking.getRoom().setBooked(false);

            bookings.remove(i);
            FileManager.saveBookings(bookings);

            System.out.println("\nBooking cancelled successfully.");

            return;
        }
    }

    System.out.println("Booking not found.");
}
}