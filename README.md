# EcommerceApplication
 Ecommerce Application is a web-based application that allows customers to buy products online. The application provides an easy-to-use interface for customers to search and browse products, add them to the cart, and complete the checkout process. The application also provides an admin dashboard to manage products, orders, and customers


# Tech Stack
- Java
- Spring Framework
- Spring Boot
- Spring Data JPA
- MySQL
- Swagger UI
- Lambok
- Maven


# Modules

- Login Module

- User Module

- Admin Module
- CurrentUser module

- Store Module
- Product Module
- Order Module


# Features
# Customer Features
- Sign up and Login: Customers can sign up and log in to the application to access the full features of the application.

- Search Products: Customers can search products using keywords.

- Browse Products: Customers can browse products by categories.

- Product Details: Customers can view the product details including price, description, and images.

- Add to Cart: Customers can add products to their cart.

- Update Cart: Customers can update the quantity of the products in their cart.

- Remove from Cart: Customers can remove products from their cart.

- Checkout: Customers can complete the checkout process by providing shipping and payment information.

- Order History: Customers can view their order history.

# Admin Features
- Admin Dashboard: Admin can access the admin dashboard to manage products, orders, and customers.

- Add Products: Admin can add new products including name, price, description, and images.

- Update Products: Admin can update the product details including name, price, description, and images.

- Remove Products: Admin can remove products from the application.

- View Orders: Admin can view the list of orders and their details including customer information and order status.

- Update Order Status: Admin can update the order status including "Processing", "Shipped", and "Delivered".

- View Customers: Admin can view the list of customers and their details including name and email.






# Validation
- This project uses validation annotations to ensure that user input is in the correct format. The following validations are implemented:

- First Name: Must not contain numbers or special characters
- Last Name: Must not contain numbers or special characters
- Mobile Number: Must have 10 digits
- Password: Must be alphanumeric and contain 6-12 characters with at least one special character, one upper case, one lowercase, and one digit
- Email: Must be in the correct email format
- Product Name: Must not be empty and must be unique within a store
- Product Description: Must not be empty
- Price: Must be a positive number
- Quantity: Must be a positive number
- Store Name: Must not be empty and must be unique within the platform



# Installation & Run
 - Before running the API server, you should update the database config inside the application.properties file.
- Update the port number, username and password as per your local database configuration.

```
        server.port=8080

    spring.datasource.url=jdbc:mysql://localhost:3306/MasaiEcommerceDB;
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.datasource.username=root
    spring.datasource.password=root

```

# API Root Endpoint
```
https://localhost:8080/
```
```
http://localhost:8080/swagger-ui/
```
