package services;

import Entities.Customer;
import Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;


    public List<Customer> getAllCustomer(){
        return  customerRepository.getAllCustomer();
    }

    public Customer getCustomerById(Integer id) {
        return customerRepository.getCustomerById(id);
    }

    public Customer getCustomerByName(String name){
        return customerRepository.getCustomerByName(name);

    }

    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }



















}
