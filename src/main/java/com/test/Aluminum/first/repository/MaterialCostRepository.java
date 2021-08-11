package com.test.Aluminum.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.Aluminum.first.domain.MaterialCostBean;

public interface MaterialCostRepository extends JpaRepository<MaterialCostBean,Integer> {

}
