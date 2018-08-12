package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService
{
    /*
     * member injection
     * @Autowired private CustomerRepository customerRepository;
     */

    /*
     * setter injection private CustomerRepository customerRepository;
     * @Autowired public void setCustomerRepository(CustomerRepository customerRepository) { this.customerRepository =
     * customerRepository; }
     */

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository)
    {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll()
    {
        return customerRepository.findAll();
    }
}
