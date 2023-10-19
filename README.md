# <h1 align = "center">  HotelManagement </h1>
___ 
<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.1.3-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
</p>

---

<p align="left">

<!-- Project Description -->
## Overview
<p align="center">This project,   Insta Basic ," is a robust Spring Boot application designed for managing user data efficiently. It provides a set of API endpoints that allow you to perform various operations on user records, such as adding, retrieving, updating, and deleting user information. 
</p>

<!-- Table of Contents -->
## Table of Contents
1. [Technologies Used](#technologies-used)
2. [Key Features](#key-features)
3. [Usage](#usage)
4. [API reference](#api-reference)
5. [License](#license)
6. [Acknowledgments](#acknowledgments)
7. [Contact](#contact)

<!-- Technologies Used -->
## Technologies Used
- Java 8
- Spring Boot
- Spring Web Initializer
- Maven
- Spring Web Dependency
- SQL DRIVER
- JPA
- SWAGGER
- sQL DATABASE
- OneToOne Mapping
- OneToMany Mapping
- ManyToMany Mapping
- ManyToOne Mapping

## Model Classes
1. Billing Model
The Billing Model handles information related to guest bills, including charges for room, services, and additional expenses.
2. Guest Model
The Guest Model manages guest-related data, such as guest information, contact details, and preferences.
3. Reservation Model
The Reservation Model stores information about reservations, including check-in and check-out dates, room allocation, and any special requests.
4. Room Model
The Room Model handles room-specific data, including room types, availability, and pricing.
## Controller Class
1. Billing Controller
The Billing Controller is responsible for handling billing-related operations, including generating guest bills, calculating charges for room, services, and additional expenses.
2. Guest Controller
The Guest Controller manages operations related to guest data, including guest information, contact details, and preferences.
3. Reservation Controller
The Reservation Controller handles operations related to reservations, such as booking, check-in, check-out, room allocation, and special requests.
4. Room Controller
The Room Controller is responsible for room-specific operations, including managing room types, availability, and pricing.
Features
Logic for managing billing, guest, reservation, and room data.
Real-time calculations for generating guest bills and calculating charges.
Operations for booking, check-in, and check-out of guests.
Managing room availability and pricing.
Controller Architecture
The Controller component follows the Model-View-Controller (MVC) architecture. It interacts with the Model (data and database), communicates with the View (user interface), and ensures the system's smooth operation.

## Service Class
1. Billing Service
The Billing Service is responsible for executing operations related to billing within the HMS system. It facilitates the generation of guest bills, calculation of charges for room, services, and additional expenses.
2. Guest Service
The Guest Service manages operations related to guest data, including guest information, contact details, and preferences. It ensures a smooth guest experience throughout their stay.
3. Reservation Service
The Reservation Service handles operations related to reservations, such as booking, check-in, check-out, room allocation, and handling special requests. It ensures efficient management of guest reservations.
4. Room Service
The Room Service is responsible for executing operations related to rooms, including managing room types, availability, pricing, and room-related functionalities.
## Features
Implementation of core service functionalities for Billing, Guest, Reservation, and Room entities.
Integration with the Controller to execute user requests.
Real-time billing calculations for generating guest bills.
Efficient management of guest reservations and room allocation.
Service Architecture
The Service component follows a modular and service-oriented architecture to ensure the efficient execution of various tasks. It interacts with the Controller and Model components to provide a seamless experience for users.


<!-- Key Features -->
## Key Features
- Get Student by Id.
- Get all Sudent.
- Get Student Details By Id.
- Delete Course By Id.
- Update StudentName
- SingUp
- SingIn

<!-- Usage -->
## Usage
- Access the application at `http://localhost:8080`.
- Use the provided API endpoints to CRUD Operation And Custom finder.

### Controller:
- It consists of a class named APIController which basically controls the flow of data.
- @RestController annotation is used to make the APIController as a controller layer.
- We perform the CRUD operations such as @PostMapping , @GetMapping , @PutMapping , @DeleteMapping.

### API Reference

#### Add Users :
PostMethod :  http://localhost:8080/posts
### UPdate User:
PutMapping : http://localhost:8080/companyName/Id

### Delete User:
DeleteMapping: http://localhost:8080/Delete/Id/


#### Get All Users :
 - GET Method : http://localhost:8080/get

 

 <!-- Acknowledgments -->
## Acknowledgments
- Thank you to the Spring Boot and Java communities for providing excellent tools and resources.

<!-- Contact -->
## Contact
For questions or feedback, please contact : SHRAVAN KUMAR   -
- Maild Id : shravankm93@gmail.com

<h1 align="center">Thank You...<h1>
<h3 align = "center"> ***********************************************************<h3>
*  Insta Basic 
