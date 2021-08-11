package com.test.Aluminum.first.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.test.Aluminum.first.repository.CostclcRepository;
import com.test.Aluminum.first.repository.MaterialRepository;

@SpringBootTest
public class CostclcTest {
	
	@Autowired
	CostclcRepository costclcdao;
	@Autowired
	MaterialRepository materialdao;
	
	@Test
	public void method() {
		CostclcBean bean = new CostclcBean();
		bean.setCoefficient((float) 1.06);
		System.out.println(bean.getMaterialcostfk());
		
	}

}
