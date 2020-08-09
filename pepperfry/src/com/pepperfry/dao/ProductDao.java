package com.pepperfry.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pepperfry.bo.Product;
import com.pepperfry.helper.ConnectionManager;

public class ProductDao {
	public List<Product> getProducts() throws Exception {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Product> products = null;

		try {
			con = ConnectionManager.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select product_number,product_name,description,cost,manufactured_date,warrenty_years from product");

			products = new ArrayList<Product>();
			while (rs.next()) {
				products.add(new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getString(5),rs.getString(6)));
			}
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (con != null) {
				con.close();
			}
		}

		return products;
	}
}
