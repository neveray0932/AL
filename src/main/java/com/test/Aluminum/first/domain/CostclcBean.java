package com.test.Aluminum.first.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="costclc")
@Data
public class CostclcBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer costclcid;
	
	Integer material_costid;
	Integer sum_total;
	float coefficient;
	@ManyToOne
	@JoinColumn(
			name="material_costid",
			referencedColumnName = "material_costid",
			insertable=false,updatable=false
	)
	
	private MaterialCostBean materialcostfk;
	@Override
	public String toString() {
		return "CostclcBean [costclcid=" + costclcid + ", material_costid=" + material_costid + ", sum_total="
				+ sum_total + ", coefficient=" + coefficient + ", materialcostfk=" + materialcostfk + "]";
	}
	
	
}
