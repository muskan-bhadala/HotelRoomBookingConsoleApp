package model;

public class Booking {

    private static int bookingCounter = 1001;

    private String bookingId;
    private Customer customer;
    private Room room;
    private int days;
    private double totalBill;

    public Booking(Customer customer, Room room, int days) {

        this.bookingId = "B" + bookingCounter++;
        this.customer = customer;
        this.room = room;
        this.days = days;
        this.totalBill = room.getPrice() * days;
    }
    public Booking(String bookingId, Customer customer, Room room, int days) {

    this.bookingId = bookingId;
    this.customer = customer;
    this.room = room;
    this.days = days;
    this.totalBill = room.getPrice() * days;
}

    public String getBookingId() {
        return bookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Room getRoom() {
        return room;
    }

    public int getDays() {
        return days;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void displayBooking() {

        System.out.println("\n========== BOOKING DETAILS ==========");
        System.out.println("Booking ID : " + bookingId);
        customer.displayCustomer();
        room.displayRoom();
        System.out.printf("%-15s : %d%n", "Days", days);
System.out.printf("%-15s : ₹%.2f%n", "Total Bill", totalBill);
        System.out.println("=====================================");
    }
    public String getCustomerName() {
    return customer.getName();
}

public String getCustomerPhone() {
    return customer.getPhone();
}
}