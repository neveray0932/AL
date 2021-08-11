package com.test.Aluminum.first.domain;





import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.test.Aluminum.first.repository.CustRepositroy;
import com.test.Aluminum.first.repository.CustomerRepository;


@SpringBootTest
public class CustomerTest {
	

	
	@Autowired
	CustRepositroy csdao;
	@Autowired
	CustomerRepository custdao;
	
	
	//@Test
	public void insertCust() {
		Cust bean = new Cust();
		bean.setName("Andy");
		bean.setAge(18);
		csdao.save(bean);
		
		
	}
	
	@Test
	public void selectApple() {
		CustomerBean bean = new CustomerBean();
		bean.setCustomer("陳韋華");
		bean.setAddress("台中市西屯區和祥路118號");
		bean.setCellphone("12345678");
		
		bean.setContact("艾爾");
		bean.setFax("03-2322345");
		
		bean.setTel("657434");
		
		
		bean.setTitle("漢翔");
		custdao.save(bean);
		
	}

}
