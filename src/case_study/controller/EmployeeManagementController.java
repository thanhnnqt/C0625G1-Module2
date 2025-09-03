package case_study.controller;

import case_study.entity.Employee;
import case_study.service.EmployeeService;
import case_study.service.IEmployeeService;
import case_study.view.EmployeeView;

import java.util.List;
import java.util.Scanner;

public class EmployeeManagementController {
    private IEmployeeService employeeService = new EmployeeService();

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        final int DISPLAY = 1;
        final int ADD = 2;
        final int EDIT = 3;
        boolean flag = true;
        while (flag) {
            System.out.println("Employee Management");
            System.out.println("-----Menu-----" +
                    "\n 1. Display list employees" +
                    "\n 2. Add new employee" +
                    "\n 3. Edit employee" +
                    "\n 4. Return main menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case DISPLAY:
                    System.out.println("This is the display function");
                    List<Employee> employeeList = this.employeeService.findAll();
                    EmployeeView.display(employeeList);
                    break;
                case ADD:
                    Employee employee = EmployeeView.inputData();
                    this.employeeService.add(employee);
                    break;
                case EDIT:
                    System.out.println("This is the edit function");
                    System.out.println("Enter id employee");
                    String editEmployee = scanner.nextLine();
                    Employee employeeEdit = EmployeeView.editData(editEmployee);
                    this.employeeService.edit(editEmployee, employeeEdit);
                    System.out.println("Edited");
                    break;
                default:
                    flag = false;
            }
        }
    }
}
