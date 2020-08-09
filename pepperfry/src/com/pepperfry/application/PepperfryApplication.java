package com.pepperfry.application;

import java.util.List;

import com.pepperfry.bo.Product;
import com.pepperfry.dao.ProductDao;

public class PepperfryApplication {
	public static void main(String[] args) throws Exception {
		ProductDao dao = new ProductDao();
		List<Product> products = dao.getProducts();
		
		products.forEach(System.out::println);
	}
}
