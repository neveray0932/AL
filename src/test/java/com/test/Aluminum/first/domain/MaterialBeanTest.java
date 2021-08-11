package com.test.Aluminum.first.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.test.Aluminum.first.repository.MaterialRepository;

@SpringBootTest
public class MaterialBeanTest {
	@Autowired
	MaterialRepository materiadao;
	@Test
	public void method() {
		MaterialBean bean = new MaterialBean();
		bean.setMaterialname("板料-SUS");
		bean.setCategory("板材");
		bean.setCoefficient((float) 1.1);
		bean.setUnits("KG");
		bean.setUnitprice(80);
		materiadao.save(bean);
		
		
	}

}
