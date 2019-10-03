package com.softvision.training.controller;

import com.softvision.training.domain.Customer;
import com.softvision.training.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    /** HTTP method GET **/
    /** URL: http://localhost:8080/restfulapp/customers **/

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public ResponseEntity<?> getCustomers() {
        Iterable<Customer> customerList = customerService.getCustomers();
        return new ResponseEntity<>(customerList, HttpStatus.OK);
    }

    /** HTTP method GET with customerId **/
    /** URL: http://localhost:8080/restfulapp/customers/{customerId} **/

    @RequestMapping(value = "/customers/{customerId}", method = RequestMethod.GET)
    public ResponseEntity<?> getCustomer(@PathVariable long customerId) {
        Customer customer = customerService.getCustomer(customerId);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    /** HTTP method POST **/
    /** URL: http://localhost:8080/restfulapp/customers **/

    @RequestMapping(value = "/customers", method = RequestMethod.POST)
    public ResponseEntity<?> addCustomer(@RequestBody Customer customer) {
        Customer aNewCustomer = customerService.newCustomer(customer);
        return new ResponseEntity<>(aNewCustomer, HttpStatus.CREATED);
    }

    /** HTTP method PUT **/
    /** URL: http://localhost:8080/restfulapp/customers/{customerId} **/

    @RequestMapping(value = "/customers/{customerId}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateCustomer(@PathVariable long customerId, @RequestBody Customer customer) {
        Customer setUpCustomer = customerService.updateCustomer(customerId, customer);
        return new ResponseEntity<>(setUpCustomer, HttpStatus.OK);
    }

    /** HTTP method DELETE **/
    /** URL: http://localhost:8080/restfulapp/customers/{customerId} **/

    @RequestMapping(value = "/customers/{customerId}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteCustomer(@PathVariable long customerId) {
        Customer customer = customerService.getCustomer(customerId);
        customerService.deleteCustomer(customer);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    /** HTTP method GET **/
    /** URL: http://localhost:8080/restfulapp **/
    /** Initial message without calling the customers **/

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<?> home() {
        return new ResponseEntity<>("This is a new restful app", HttpStatus.OK);
    }


    }
