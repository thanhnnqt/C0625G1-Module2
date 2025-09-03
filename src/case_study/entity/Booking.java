package case_study.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Objects;

public class Booking implements Comparable<Booking> {
    private String idBook;
    private String idService;
    private String idCustomer;
    private LocalDate bookingDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Booking() {
    }

    public Booking(String idBook, String idEmployee, String idCustomer, LocalDate bookingDate, LocalDate startDate, LocalDate endDate) {
        this.idBook = idBook;
        this.idService = idService;
        this.idCustomer = idCustomer;
        this.bookingDate = bookingDate;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idEmployee) {
        this.idService = idEmployee;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBook='" + idBook + '\'' +
                ", idEmployee='" + idService + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                ", bookingDate=" + bookingDate +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    public String getInfoToCSV() {
        return idBook + "," + idService + "," + idCustomer + "," + bookingDate.format(formatter)
                + "," + startDate.format(formatter) + "," + endDate.format(formatter);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Booking)) return false;
        Booking booking = (Booking) o;
        return Objects.equals(idBook, booking.idBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBook);
    }

    @Override
    public int compareTo(Booking o) {
        int result = this.startDate.compareTo(o.startDate);
        if (result == 0) {
            result = this.endDate.compareTo(o.endDate);
        }
        return result;
    }
    public static class BookingComparator implements Comparator<Booking> {
        @Override
        public int compare(Booking b1, Booking b2) {
            int result = b1.getStartDate().compareTo(b2.getStartDate());
            if (result == 0) {
                result = b1.getEndDate().compareTo(b2.getEndDate());
            }
            return result;
        }
    }
}
