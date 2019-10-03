package com.softvision.training.service;

import com.softvision.training.domain.Customer;
import com.softvision.training.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class CustomerService {

    /** Now we use a repository **/

    @Autowired
    private CustomerRepository customerRepository;

    /** get all customers **/

    public Iterable<Customer> getCustomers() {
        return customerRepository.findAll();
    }

      /** get customer based on its Id
     *@param_customerId
     *@return **/

    public Customer getCustomer(long customerId) {
        return customerRepository.findById(customerId).get();

    } /**Preguntar aqui porque Optional **/


    /** update existing customer **/
    /** @param_customerId **/
    /** @param_customer **/

    public Customer updateCustomer (long customerId, Customer customer) {
        return customerRepository.save(customer);
    }

    /** add a customer **/
    /** @param_customer **/
    /** @return **/

    public Customer newCustomer(Customer customer) {
        return customerRepository.save(customer);
    }


    /** delete a customer **/
    /** @param_customer **/
    /** @return **/

    public void deleteCustomer (Customer customer) {
        customerRepository.delete(customer);
    }

    /** Set up a few customer **/

    /**@PostConstruct
    private void setupcustomer() {
        customerList = new ArrayList<Customer>();
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Marco");
        customer.setSport("Tennis");
        customer.setPersonalIdNumber(123456);
        customer.setPhone("54234567");
        customerList.add(customer);

        Customer customer1 = new Customer();
        customer.setId(2);
        customer.setName("Carla");
        customer.setSport("Swimming");
        customer.setPersonalIdNumber(10203040);
        customer.setPhone("54281222");
        customerList.add(customer);
    }**/

}
