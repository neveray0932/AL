package com.test.Aluminum.first.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


import lombok.Data;

@Entity
@Table(name="customer")
@Data
public class CustomerBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4158893263880391907L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerid;
	private String customer;
	
	private String title;
	private String address;
	private String tel;
	private String fax;
	private String contact;
	private String cellphone;
	private Integer taxnumber;
	

}
