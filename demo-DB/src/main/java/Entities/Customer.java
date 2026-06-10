package Entities;

import jakarta.persistence.Entity;

@Entity
public class Customer {
    String customerID;
    String customerName;
    Integer accountNumber;
    Double balance;
    String Email;
    String phoneNumber;

}
