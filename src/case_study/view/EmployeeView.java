package case_study.view;

import case_study.entity.Employee;
import case_study.repository.EmployeeRepository;
import case_study.service.EmployeeService;
import case_study.util.InputException;
import case_study.util.Validate;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    static Scanner scanner = new Scanner(System.in);
    static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void display(List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    public static Employee inputData() {
        String name;
        String phoneNumber;
        LocalDate dateEnter = null;
        String id;
        String idEmployee;
        String email;
        while (true) {
            System.out.println("Enter name");
            name = scanner.nextLine();
            try {
                Validate.ValidateName(name);
                break;
            } catch (Exception e) {
                System.out.println("-----Name error-----");
            }
        }
        while (true) {
            System.out.println("Enter phone number");
            phoneNumber = scanner.nextLine();
            try {
                Validate.ValidatePhoneNumber(phoneNumber);
                break;
            } catch (Exception e) {
                System.out.println("-----Phone number error-----");
            }
        }
        while (true) {
            try {
                System.out.println("Enter date");
                dateEnter = LocalDate.parse(scanner.nextLine(), timeFormatter);
                break;
            } catch (DateTimeException e) {
                System.out.println(e.getMessage() + "dd/MM/yyyy");
            }
        }
        while (true) {
            System.out.println("Enter id");
            id = scanner.nextLine();
            try {
                Validate.ValidateId(id);
                break;
            } catch (Exception e) {
                System.out.println("-----Id error-----");
            }
        }
        System.out.println("Enter address");
        String address = scanner.nextLine();
        System.out.println("Enter gender (male/female)");
        String gender = scanner.nextLine();
        while (true) {
            System.out.println("Enter id employee");
            idEmployee = scanner.nextLine();
            try {
                Validate.ValidateIdEmployee(idEmployee);
                break;
            } catch (InputException e) {
                System.out.println("-----Id employee error-----");
            }
        }
        System.out.println("Enter salary");
        int salary = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter level");
        String level = scanner.nextLine();
        System.out.println("Enter location");
        String location = scanner.nextLine();
        while (true) {
            System.out.println("Enter email");
            email = scanner.nextLine();
            try {
                Validate.ValidateMail(email);
                break;
            } catch (InputException e) {
                System.out.println("-----Email error-----");
            }
        }

        Employee employee = new Employee(name, phoneNumber, dateEnter, id, address, gender, idEmployee, salary, level, location, email);
        return employee;
    }
    public static Employee editData(String idEdit) {
        String name;
        String phoneNumber;
        LocalDate dateEnter = null;
        String id;
        String email;
        while (true) {
            System.out.println("Enter name");
            name = scanner.nextLine();
            try {
                Validate.ValidateName(name);
                break;
            } catch (Exception e) {
                System.out.println("-----Name error-----");
            }
        }
        while (true) {
            System.out.println("Enter phone number");
            phoneNumber = scanner.nextLine();
            try {
                Validate.ValidatePhoneNumber(phoneNumber);
                break;
            } catch (Exception e) {
                System.out.println("-----Phone number error-----");
            }
        }
        while (true) {
            try {
                System.out.println("Enter date");
                dateEnter = LocalDate.parse(scanner.nextLine(), timeFormatter);
                break;
            } catch (DateTimeException e) {
                System.out.println(e.getMessage() + "dd/MM/yyyy");
            }
        }
        while (true) {
            System.out.println("Enter id");
            id = scanner.nextLine();
            try {
                Validate.ValidateId(id);
                break;
            } catch (Exception e) {
                System.out.println("-----Id error-----");
            }
        }
        System.out.println("Enter address");
        String address = scanner.nextLine();
        System.out.println("Enter gender (male/female)");
        String gender = scanner.nextLine();
        System.out.println("Enter salary");
        int salary = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter level");
        String level = scanner.nextLine();
        System.out.println("Enter location");
        String location = scanner.nextLine();
        while (true) {
            System.out.println("Enter email");
            email = scanner.nextLine();
            try {
                Validate.ValidateMail(email);
                break;
            } catch (InputException e) {
                System.out.println("-----Email error-----");
            }
        }

        Employee employee = new Employee(name, phoneNumber, dateEnter, id, address, gender, idEdit, salary, level, location, email);
        return employee;
    }
}
