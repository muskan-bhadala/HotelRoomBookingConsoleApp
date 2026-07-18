package app;

import service.HotelService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HotelService hotelService = new HotelService();

        int choice;

        do {

            System.out.println("\n=================================");
            System.out.println("   HOTEL ROOM BOOKING SYSTEM");
            System.out.println("=================================");

            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Search Booking");
            System.out.println("5. View All Bookings");
            System.out.println("6. Exit");

            System.out.print("\nEnter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    hotelService.viewRooms();
                    break;

                case 2:
                    hotelService.bookRoom();
                    break;

                case 3:
                    hotelService.cancelBooking();
                    break;

                case 4:
                    hotelService.searchBooking();
                    break;

                case 5:
                    hotelService.viewAllBookings();
                    break;

                case 6:
                    System.out.println("\nThank you for using the system.");
                    break;

                default:
                    System.out.println("\nInvalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}