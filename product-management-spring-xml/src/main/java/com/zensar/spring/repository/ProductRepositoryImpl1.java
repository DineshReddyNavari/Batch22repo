package com.zensar.spring.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.zensar.spring.beans.Product;

public class ProductRepositoryImpl1 implements ProductRepository {

	private NamedParameterJdbcTemplate template;

	public ProductRepositoryImpl1() {

	}

	public int insertProduct(Product product) {
		// createTable();
		String sql = "insert into product values(" + product.getProductId() + ",'" + product.getProductName() + "',"
				+ product.getProductCost() + ");";
		template.execute(sql, null);
		return 1;
	}

	public boolean deleteProduct(int productId) {
		SqlParameterSource namedParameters = new MapSqlParameterSource("productId", productId);
		String sql = "delete from product where productId=:productId";

		return template.update(sql, namedParameters) > 0;
	}

	public int updateProduct(Product product) {
		String sql = "update product set productName = :productName, productCost = :productCost where productId=:productId";

		Map<String, String> params = new HashMap<String, String>();

		params.put("productId", "2");
		params.put("productName", "Computer");
		params.put("productCost", "91283");
		return template.update(sql, params);
	}


	public NamedParameterJdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(NamedParameterJdbcTemplate template) {
		this.template = template;
	}

	public List<Product> readProducts() {

		String sql = "select * from product";
		List<Product> product = template.query(sql, (rs, rowNum) -> new Product(rs.getInt("productId"),
				rs.getString("productName"), rs.getInt("productCost")));
		return product;

	}

}
