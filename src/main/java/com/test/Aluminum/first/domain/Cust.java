package com.test.Aluminum.first.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Nationalized;

import lombok.Data;

@Entity
@Table(name="cust")
@Data
public class Cust {
	@Id
	
	private String name;
	@Nationalized
	private Integer age;
	
}
