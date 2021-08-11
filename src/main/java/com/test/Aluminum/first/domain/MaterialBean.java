package com.test.Aluminum.first.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import lombok.Data;

@Entity
@Table(name="material")
@Data
public class MaterialBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer materialid;
	String materialname;
	String category;
	float coefficient;
	Integer unitprice;
	String units;
	Integer cost;
	String memo;
	@OneToMany(mappedBy="materialfk",cascade= {CascadeType.ALL},fetch = FetchType.LAZY)
	private List<MaterialCostBean> materialcost;
	@Override
	public String toString() {
		return "MaterialBean [materialid=" + materialid + ", materialname=" + materialname + ", category=" + category
				+ ", coefficient=" + coefficient + ", unitprice=" + unitprice + ", units=" + units + ", cost=" + cost
				+ ", memo=" + memo + ", materialcost=" + materialcost + "]";
	}
}
