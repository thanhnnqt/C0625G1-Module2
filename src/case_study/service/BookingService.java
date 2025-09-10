package case_study.service;

import case_study.entity.Booking;
import case_study.entity.Contract;
import case_study.repository.BookingRepository;
import case_study.repository.ContractRepository;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public class BookingService {
    private final BookingRepository bookingRepository;
    private final ContractRepository contractRepository;
    public BookingService(BookingRepository bookingRepository, ContractRepository contractRepository) {
        this.bookingRepository = bookingRepository;
        this.contractRepository = contractRepository;
    }
    public void addNewBooking(Booking booking) {
        if (bookingRepository.getAllBookings().contains(booking)) {
            System.out.println("Error " + booking.getIdBook() + " exist");
            return;
        }
        bookingRepository.addNewBooking(booking);
        System.out.println("Add booking success");
    }
    public void createContractFromQueue() {
        Booking earliestBooking = bookingRepository.getEarliestBooking();

        if (earliestBooking != null) {
            System.out.println("Creating a contract: " + earliestBooking.getIdBook());
            String contractId = "HD-" + UUID.randomUUID().toString().substring(0, 8);
            Contract contract = new Contract(
                    contractId,
                    earliestBooking.getIdBook(),
                    earliestBooking.getIdCustomer(),
                    earliestBooking.getIdService()
            );
            contractRepository.addContract(contract);
            System.out.println("Created and saved contract: " + contractId);
        } else {
            System.out.println("There are no bookings left in the queue to create a contract");
        }
    }
    public void displayAllBookings() {
        Set<Booking> allBookings = bookingRepository.getAllBookings();
        if (allBookings.isEmpty()) {
            System.out.println("Not found booking");
            return;
        }
        System.out.println("--- ALL CONTRACT ---");
        allBookings.forEach(System.out::println);
    }

    public void displayAllContracts() {
        List<Contract> allContracts = contractRepository.getAllContracts();
        if (allContracts.isEmpty()) {
            System.out.println("No contract");
            return;
        }
        System.out.println("--- ALL CONTRACT ADDED ---");
        allContracts.forEach(System.out::println);
    }
}
