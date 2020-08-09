package com.pepperfry.bo;

public class Product {
	protected int productNo;
	protected String productName;
	protected String description;
	protected float cost;
	protected String manufactured_date;
	protected String warrenty_years;

	public Product(int productNo, String productName, String description, float cost, String manufactured_date,
			String warrenty_years) {
		super();
		this.productNo = productNo;
		this.productName = productName;
		this.description = description;
		this.cost = cost;
		this.manufactured_date = manufactured_date;
		this.warrenty_years = warrenty_years;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public void setManufactured_date(String manufactured_date) {
		this.manufactured_date = manufactured_date;
	}

	public void setWarrenty_years(String warrenty_years) {
		this.warrenty_years = warrenty_years;
	}

	@Override
	public String toString() {
		return "Product [productNo=" + productNo + ", productName=" + productName + ", description=" + description
				+ ", cost=" + cost + ", manufactured_date=" + manufactured_date + ", warrenty_years=" + warrenty_years
				+ "]";
	}

}
