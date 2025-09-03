package case_study.repository;

import case_study.entity.Booking;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class BookingRepository {
    private static final String BOOK = "src/case_study/data/book.csv";
    private static Set<Booking> bookingSet;
    private static PriorityQueue<Booking> bookingQueue;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    static {
        bookingSet = new TreeSet<>(new Booking.BookingComparator());
        bookingQueue = new PriorityQueue<>(new Booking.BookingComparator());
        readBookingsFromFile();
    }
    private static void readBookingsFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(BOOK))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 5) {
                    try {
                        Booking booking = new Booking(data[0], data[1], data[2], LocalDate.parse(data[3], formatter), LocalDate.parse(data[4], formatter), LocalDate.parse(data[5], formatter));
                        bookingSet.add(booking);
                        bookingQueue.add(booking);
                    } catch (DateTimeParseException e) {
                        System.err.println("Error here: " + line);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
    public Set<Booking> getAllBookings() {
        return new TreeSet<>(bookingSet);
    }
    public void addNewBooking(Booking booking) {
        if (!bookingSet.contains(booking)) {
            bookingSet.add(booking);
            bookingQueue.add(booking);
            saveBookingsToFile();
        } else {
            System.err.println("Booking exist");
        }
    }
    public void displayAllBookings() {
        if (bookingSet.isEmpty()) {
            System.out.println("Error file");
        } else {
            bookingSet.forEach(System.out::println);
        }
    }

    public Booking getEarliestBooking() {
        return bookingQueue.poll();
    }

    private void saveBookingsToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(BOOK))) {
            for (Booking booking : bookingSet) {
                bw.write(booking.getInfoToCSV());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error write file booking.csv: " + e.getMessage());
        }
    }
}
