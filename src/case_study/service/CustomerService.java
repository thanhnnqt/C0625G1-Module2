package case_study.service;

import case_study.entity.Customer;
import case_study.repository.CustomerRepository;
import case_study.repository.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService {
    private final ICustomerRepository customerRepository = new CustomerRepository();
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public boolean add(Customer customer) {
        return customerRepository.add(customer);
    }

    @Override
    public boolean edit(String id, Customer customer) {
        return customerRepository.edit(id, customer);
    }

    @Override
    public boolean delete(String id) {
        return customerRepository.delete(id);
    }

    @Override
    public boolean search(String id) {
        return customerRepository.search(id);
    }
}
