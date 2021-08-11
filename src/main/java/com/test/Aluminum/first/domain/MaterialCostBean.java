package com.test.Aluminum.first.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name="material_cost")
@Data
public class MaterialCostBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer material_costid;
	Integer materialid;
	float dosage;
	Integer total;
	String spec;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(
			name="materialid",
			referencedColumnName = "materialid",
			insertable=false,updatable=false
	)
	
	private MaterialBean materialfk;
	
	@OneToMany(mappedBy="materialcostfk",cascade= {CascadeType.ALL},fetch = FetchType.LAZY)
	private List<CostclcBean> costclc_materialcost;

	@Override
	public String toString() {
		return "MaterialCostBean [material_costid=" + material_costid + ", materialid=" + materialid + ", dosage="
				+ dosage + ", total=" + total + ", spec=" + spec + "]";
	}
}
