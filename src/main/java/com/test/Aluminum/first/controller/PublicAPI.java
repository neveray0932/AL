package com.test.Aluminum.first.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.Aluminum.first.domain.CustomerBean;
import com.test.Aluminum.first.domain.MaterialBean;
import com.test.Aluminum.first.repository.CustomerRepository;
import com.test.Aluminum.first.service.CustomerService;
import com.test.Aluminum.first.service.MaterialService;


@RestController
@RequestMapping(path={"/public/api"})
public class PublicAPI {

	@Autowired
	private CustomerRepository custdao;
	@Autowired
	private CustomerService customerService;
	@Autowired
	private MaterialService materialService;
	
	@GetMapping("/customer")
	public ResponseEntity<List<CustomerBean>> selectCustAll() {
		List<CustomerBean> result = custdao.findAll();
		return ResponseEntity.ok(result);
	}
	
	@GetMapping("/material")
	public ResponseEntity<List<MaterialBean>> selectMeterialAll() {
		List<MaterialBean> result = materialService.selectAll();
		return ResponseEntity.ok(result);
	}
	
	@PostMapping("/customer")
	public ResponseEntity<?> insert(@RequestBody CustomerBean bean ) {
		CustomerBean result = customerService.insert(bean);
		if(result!=null) {
			ResponseEntity<CustomerBean> entity = ResponseEntity
					.created(URI.create("/public/api/customer/"+result.getCustomerid()))
					.body(result);
			return entity;
		}
		else {
			ResponseEntity<?> entity = ResponseEntity.noContent().build();
			return entity;
		}
		
		
	}
	@PostMapping("/material")
	public ResponseEntity<?> insertMaterial(@RequestBody MaterialBean bean ) {
		MaterialBean result = materialService.insert(bean);
		if(result!=null) {
			ResponseEntity<MaterialBean> entity = ResponseEntity
					.created(URI.create("/public/api/material/"+result.getMaterialid()))
					.body(result);
			return entity;
		}
		else {
			ResponseEntity<?> entity = ResponseEntity.noContent().build();
			return entity;
		}
		
		
	}
	@PutMapping("/customer/{id}")
	public ResponseEntity<?> update(@PathVariable("id") Integer id , @RequestBody CustomerBean bean) {
//		System.out.println(id + ":" + bean);
		CustomerBean result = customerService.update(bean);
		if(result!=null) {
			ResponseEntity<CustomerBean> entity = ResponseEntity.ok(result);
			return entity;
		}else {
			ResponseEntity<?> entity = ResponseEntity.notFound().build();
			return entity;
		}
		
	}
	@DeleteMapping("/customer/{id}")
	public ResponseEntity<?> remove(@PathVariable("id") Integer id) {
		CustomerBean bean = new CustomerBean();
		bean.setCustomerid(id);
		boolean result= customerService.delete(bean);
		if(result) {
			ResponseEntity<?> entity = ResponseEntity.noContent().build();		
			return entity;
			}else {
			ResponseEntity<?> entity = ResponseEntity.notFound().build();
			return entity;	
		}
	}
}
