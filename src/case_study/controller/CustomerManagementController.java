package case_study.controller;

import case_study.entity.Customer;
import case_study.service.CustomerService;
import case_study.service.ICustomerService;
import case_study.view.CustomerView;

import java.util.List;
import java.util.Scanner;

public class CustomerManagementController {
    private ICustomerService customerService = new CustomerService();

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        final int DISPLAY = 1;
        final int ADD = 2;
        final int EDIT = 3;
        boolean flag = true;
        while (flag) {
            System.out.println("Customer Management");
            System.out.println("-----Menu-----" +
                    "\n 1. Display list customers" +
                    "\n 2. Add new customer" +
                    "\n 3. Edit customer" +
                    "\n 4. Return main menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case DISPLAY:
                    System.out.println("This is the display function");
                    List<Customer> customerList = this.customerService.findAll();
                    CustomerView.display(customerList);
                    break;
                case ADD:
                    Customer customer = CustomerView.inputData();
                    this.customerService.add(customer);
                    break;
                case EDIT:
                    System.out.println("This is the edit function");
                    System.out.println("Enter id customer");
                    String editCustomer = scanner.nextLine();
                    Customer customerEdit = CustomerView.editData(editCustomer);
                    this.customerService.edit(editCustomer, customerEdit);
                    System.out.println("Edited");
                    break;
                default:
                    flag = false;
            }
        }
    }
}
