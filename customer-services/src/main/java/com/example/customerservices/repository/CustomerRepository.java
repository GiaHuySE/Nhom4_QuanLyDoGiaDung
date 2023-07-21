package com.example.customerservices.repository;

import com.example.customerservices.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

    @Query(value = "SELECT * FROM customer where IdCus = ?", nativeQuery = true)
    public Customer findCusById(int idCus);

}