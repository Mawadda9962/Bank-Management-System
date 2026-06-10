package com.example.demo_DB.controllers;

import com.example.demo_DB.Entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo_DB.services.CustomerService;

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

    @DeleteMapping("deleteById")
    public Boolean deleteById(@RequestParam Integer id){
        return customerService.deleteById(id);
    }

    @PutMapping("update")
    public Customer updateCustomer(@RequestParam Integer id,@RequestBody Customer customer) throws Exception{
        return customerService.updateCustomer(id,customer);

    }

}
