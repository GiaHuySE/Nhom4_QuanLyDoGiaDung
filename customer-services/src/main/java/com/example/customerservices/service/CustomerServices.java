package com.example.customerservices.service;

import com.example.customerservices.model.Customer;
import com.example.customerservices.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServices {

    @Autowired
    private CustomerRepository customerRepository;

//	@Autowired
//	@LoadBalanced
//	private RestTemplate restTemplate; //rest-template not working in class service

    public List<Customer> listCustomers() {
        return customerRepository.findAll();
    }

//	public ResponseTemplateDTO getCustomerWithUser(int idCus) {
//		Customer customer = customerRepository.findCusById(idCus);
//		User user = restTemplate.getForObject("http://USER-SERVICES/api/user-service/user/" +customer.getIdUser(), User.class);
//		return new ResponseTemplateDTO(customer, user);
//	}

    public Customer findByIntId(int id) {
        return customerRepository.findCusById(id);
    }

    public Optional<Customer> findById(String id){
        return customerRepository.findById(id);
    }
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    public void deletedCustomer(Customer customer) {
        customerRepository.delete(customer);
    }
    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}