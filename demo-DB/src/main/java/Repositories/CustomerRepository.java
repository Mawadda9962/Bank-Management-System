package Repositories;

import Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

   @Query("SELECT c FROM Customer c")
    List<Customer> getAllCustomer();

   @Query("SELECT c FROM Customer c WHERE c.customerID=:customerId")
    Customer getCustomerById(@Param("customerID") Integer id);

   @Query("SELECT c FROM Customer c WHERE c.customerName=:customerName")
    Customer getCustomerByName(@Param("customerName") String name);
}
