package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Booking;

public class FileManager {

    private static final String FILE_NAME = "../data/bookings.txt";

    // Save all bookings to file
    public static void saveBookings(ArrayList<Booking> bookings) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {

            for (Booking booking : bookings) {

                writer.write(
                        booking.getBookingId() + "," +
                        booking.getCustomer().getCustomerId() + "," +
                        booking.getCustomerName() + "," +
                        booking.getCustomerPhone() + "," +
                        booking.getRoom().getRoomNumber() + "," +
                        booking.getRoom().getRoomType() + "," +
                        booking.getRoom().getPrice() + "," +
                        booking.getDays());

                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error saving bookings.");
        }
    }

    // Read all booking lines from file
    public static List<String> loadBookingLines() {

        List<String> lines = new ArrayList<>();
        

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {

            String line;

            while ((line = reader.readLine()) != null) {

                if (!line.trim().isEmpty()) {
                    lines.add(line);
                }
            }

        } catch (IOException e) {
            // File may not exist on first run
        }

        return lines;
    }
}