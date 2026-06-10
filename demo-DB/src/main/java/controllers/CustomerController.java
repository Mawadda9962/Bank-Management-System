package controllers;

import Entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.CustomerService;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("getAll")
    public List<Customer> getAll() {
        return customerService.getAllCustomer();
    }

    @GetMapping("getById")
    public Customer getById(@RequestParam Integer id){
        return customerService.getCustomerById(id);
    }

    @GetMapping("getByName")
    public Customer getByName(@RequestParam String name){
        return customerService.getCustomerByName(name);
    }

    @PostMapping("add")
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }








}
