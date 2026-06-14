Bank Management System

Overview:
The Bank Management System is a RESTful web application developed using Spring Boot, Spring Data JPA, and MySQL. 
The system provides a set of APIs for managing customer information, including creating, retrieving, updating, and deleting customer records. 
The project follows a layered architecture consisting of Controller, Service, Repository, and Entity layers.


Technologies Used: Java, Spring Boot, Spring Data JPA, MySQL, Maven, Postman.


Features:
1. Add a new customer
2. Retrieve all customers
3. Find customer by ID
4. Find customer by name
5. Update customer information
6. Delete customer by ID

Customer Information:
Each customer record contains the following details:
Customer ID
Customer Name
Account Number
Balance
Email Address
Phone Number



API Endpoints
1. Get All Customers
Method:
GET
/customer/getAll
Retrieves all customer records from the database.

2. Get Customer by ID
Method: GET
/customer/getById?id={id}
Retrieves a customer based on the provided customer ID.

3. Get Customer by Name
Method: GET
/customer/getByName?name={name}
Retrieves a customer based on the provided customer name.

4. Add Customer
Method: POST
/customer/add
Creates a new customer record in the database.

5. Update Customer
Method: PUT
/customer/update?id={id}
Updates the information of an existing customer.

6. Delete Customer
Method: DELETE
/customer/deleteById?id={id}
Removes a customer record from the database.


Testing
All APIs were tested successfully using Postman to verify CRUD operations and database integration.
