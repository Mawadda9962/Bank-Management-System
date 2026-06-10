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


    public Boolean deleteById(Integer id){
        Customer customer = customerRepository.getCustomerById(id);

        if (customer != null){
            customerRepository.delete(customer);
            return true;
        }
        return false;
    }

    public Customer updateCustomer(Customer customer) throws Exception{

        Customer existingCustomer = customerRepository.getCustomerById(customer.getCustomerID());

        if(existingCustomer != null){
            existingCustomer.setCustomerName(customer.getCustomerName());
            existingCustomer.setAccountNumber(customer.getAccountNumber());
            existingCustomer.setBalance(customer.getBalance());
            existingCustomer.setEmail(customer.getEmail());
            existingCustomer.setPhoneNumber(customer.getPhoneNumber());

            return customerRepository.save(existingCustomer);
        }

        throw new Exception("Customer not found");;


    }

}
