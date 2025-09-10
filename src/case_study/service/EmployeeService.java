package case_study.service;

import case_study.entity.Employee;
import case_study.repository.EmployeeRepository;
import case_study.repository.IEmployeeRepository;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    private final IEmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public boolean add(Employee employee) {
        return employeeRepository.add(employee);
    }

    @Override
    public boolean edit(String id, Employee employee) {
        return employeeRepository.edit(id, employee);
    }

    @Override
    public boolean delete(String id) {
        return employeeRepository.delete(id);
    }

    @Override
    public boolean search(String id) {
        return employeeRepository.search(id);
    }
}
