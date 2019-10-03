package com.softvision.training.repository;

import com.softvision.training.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
