package case_study.repository;

import case_study.entity.Customer;
import case_study.entity.Employee;
import case_study.util.ReadAndWriteFile;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomerRepository implements ICustomerRepository {
    public static final String CUSTOMER = "src/case_study/data/customer.csv";
    static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(CUSTOMER);
            String[] array = null;
            for (String line : stringList) {
                array = line.split(",");
                Customer customer = new Customer(array[0], array[1], LocalDate.parse(array[2], timeFormatter), array[3], array[4], array[5],
                        array[6], array[7], array[8]);
                customerList.add(customer);
            }
        } catch (IOException e) {
            System.out.println("error reading file");
        }
        return customerList;
    }

    @Override
    public boolean add(Customer customer) {
        List<String> stringList = new ArrayList<>();
        stringList.add(customer.getInfoToCSV());
        try {
            ReadAndWriteFile.writeFileCSV(CUSTOMER, stringList, true);
        } catch (IOException e) {
            System.out.println("error reading file");
            return false;
        }
        return true;
    }

    @Override
    public boolean edit(String id, Customer customer) {
        try {
            List<Customer> customerList = findAll();
            boolean editCustomer = false;
            for (int i = 0; i < customerList.size(); i++) {
                if (Objects.equals(id, customerList.get(i).getIdCustomer())) {
                    customerList.set(i, customer);
                    editCustomer = true;
                    break;
                }
            }
            if (editCustomer) {
                List<String> stringList = new ArrayList<>();
                for (Customer customerEdit : customerList) {
                    stringList.add(customerEdit.getInfoToCSV());
                }
                ReadAndWriteFile.writeFileCSV(CUSTOMER, stringList, false);
            }
            return editCustomer;
        } catch (Exception e) {
            System.out.println("Error");
            return false;
        }
    }

    @Override
    public boolean delete(String id) {
        try {
            List<Customer> customerList = findAll();
            boolean removed = false;
            for (int i = 0; i < customerList.size(); i++) {
                if (id.equals(customerList.get(i).getIdCustomer())) {
                    customerList.remove(i);
                    removed = true;
                    break;
                }
            }
            if (removed) {
                List<String> stringList = new ArrayList<>();
                for (Customer customer : customerList) {
                    stringList.add(customer.getInfoToCSV());
                }
                bai_tap_co_ban.util.ReadAndWriteFile.writeFileCSV(CUSTOMER, stringList, false);
            }
            return removed;
        } catch (IOException e) {
            System.out.println("Error write file");
            return false;
        }
    }

    @Override
    public boolean search(String id) {
        List<Customer> customerList = findAll();
        try {
            for (Customer customer : customerList) {
                if (id.equals(customer.getIdCustomer())) {
                    System.out.println(customer);
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println("Error read file");
        }
        return false;
    }
}
