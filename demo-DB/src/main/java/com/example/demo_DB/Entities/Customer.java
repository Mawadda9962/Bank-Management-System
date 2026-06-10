package com.example.demo_DB.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor


@Entity
@Table
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer customerID;

    @NotBlank(message = "Customer Name Cannot be Empty")
    private String customerName;

    @Column(unique = true)
    private Integer accountNumber;

    @PositiveOrZero(message = "Balance Cannot be Negative")
    private Double balance;

    @Email(message = "Invalid Email")
    private String email;
    private String phoneNumber;
}
