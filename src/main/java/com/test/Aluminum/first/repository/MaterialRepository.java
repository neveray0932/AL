package com.test.Aluminum.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.Aluminum.first.domain.MaterialBean;

public interface MaterialRepository extends JpaRepository<MaterialBean, Integer> {

}
