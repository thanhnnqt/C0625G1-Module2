package case_study.repository;

import case_study.entity.Employee;
import case_study.util.ReadAndWriteFile;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmployeeRepository implements IEmployeeRepository {
    public static final String EMPLOYEE = "src/case_study/data/employee.csv";
    static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public List<Employee> findAll() {
        List<Employee> employeeList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(EMPLOYEE);
            String[] arrayEmployee = null;
            for (String line : stringList) {
                arrayEmployee = line.split(",");
                Employee employee = new Employee(arrayEmployee[0], arrayEmployee[1], LocalDate.parse(arrayEmployee[2], timeFormatter),
                        arrayEmployee[3], arrayEmployee[4], arrayEmployee[5], arrayEmployee[6],
                        Integer.parseInt(arrayEmployee[7]), arrayEmployee[8], arrayEmployee[9], arrayEmployee[10]);
                employeeList.add(employee);
            }
        } catch (IOException e) {
            System.out.println("error reading file");
        }
        return employeeList;
    }

    @Override
    public boolean add(Employee employee) {
        List<String> stringList = new ArrayList<>();
        stringList.add(employee.getInfoToCSV());
        try {
            ReadAndWriteFile.writeFileCSV(EMPLOYEE, stringList, true);
        } catch (IOException e) {
            System.out.println("error reading file");
            return false;
        }
        return true;
    }

    @Override
    public boolean edit(String id, Employee employee) {
        try {
            List<Employee> employeeList = findAll();
            boolean editEmployee = false;
            for (int i = 0; i < employeeList.size(); i++) {
                if (Objects.equals(id, employeeList.get(i).getIdEmployee())) {
                    employeeList.set(i, employee);
                    editEmployee = true;
                    break;
                }
            }
            if (editEmployee) {
                List<String> stringList = new ArrayList<>();
                for (Employee employeeEdit : employeeList) {
                    stringList.add(employeeEdit.getInfoToCSV());
                }
                ReadAndWriteFile.writeFileCSV(EMPLOYEE, stringList, false);
            }
            return editEmployee;
        } catch (Exception e) {
            System.out.println("Error");
            return false;
        }
    }

    @Override
    public boolean delete(String id) {
        try {
            List<Employee> employeeList = findAll();
            boolean removed = false;
            for (int i = 0; i < employeeList.size(); i++) {
                if (id.equals(employeeList.get(i).getIdEmployee())) {
                    employeeList.remove(i);
                    removed = true;
                    break;
                }
            }
            if (removed) {
                List<String> stringList = new ArrayList<>();
                for (Employee employee : employeeList) {
                    stringList.add(employee.getInfoToCSV());
                }
                bai_tap_co_ban.util.ReadAndWriteFile.writeFileCSV(EMPLOYEE, stringList, false);
            }
            return removed;
        } catch (IOException e) {
            System.out.println("Error write file");
            return false;
        }
    }

    @Override
    public boolean search(String id) {
        List<Employee> employeeList = findAll();
        try {
            for (Employee employee : employeeList) {
                if (id.equals(employee.getIdEmployee())) {
                    System.out.println(employee);
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println("Error read file");
        }
        return false;
    }
}
