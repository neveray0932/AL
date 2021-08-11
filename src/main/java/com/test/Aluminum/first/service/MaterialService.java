package com.test.Aluminum.first.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.Aluminum.first.domain.MaterialBean;
import com.test.Aluminum.first.repository.MaterialRepository;

@Service
public class MaterialService {
	
	@Autowired
	private MaterialRepository materialdao;
	
	public List<MaterialBean> selectAll(){
		List<MaterialBean> result = materialdao.findAll();
		
		return result;
	}
	
	public MaterialBean insert(MaterialBean bean) {
		MaterialBean result = null;
		if(bean!=null) {
			result = materialdao.save(bean);
			return result;
		}
		return result;
	}
}
