package com.test.Aluminum.first.domain;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.test.Aluminum.first.repository.MaterialCostRepository;
import com.test.Aluminum.first.repository.MaterialRepository;

@SpringBootTest
@Transactional
@Rollback(false)
public class MaterialCostTest {
	@Autowired
	MaterialCostRepository matercostdao;
	@Autowired
	MaterialRepository materialdao;
	
	//@Test
	
	public void method() {
		MaterialCostBean bean = new MaterialCostBean();
		bean.setSpec("1000*2100,SECC氣密孤框");
		bean.setMaterialid(materialdao.getById(1).getMaterialid());
		bean.setDosage((float) 40.0);
		System.out.print(bean);
//		Integer price = bean.getMaterialfk().getUnitprice();
//		System.out.println(price);
		bean.setTotal((int) (materialdao.getById(1).getUnitprice()*bean.getDosage()));
		
		matercostdao.save(bean);
		
	}
	@Test
	public void select() {
		Optional<MaterialBean> result = materialdao.findById(1);
		System.out.println(result);
	}

}
