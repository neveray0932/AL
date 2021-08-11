package com.test.Aluminum.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.Aluminum.first.domain.CustomerBean;

public interface CustomerRepository extends JpaRepository<CustomerBean, Integer> {

}
