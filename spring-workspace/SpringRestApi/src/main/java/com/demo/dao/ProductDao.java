package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Product;

@Repository
public class ProductDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Product> showProductsDao() {
		return jdbcTemplate.query("select * from product_tbl", (rs,num)->{
			Product p =new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setQty(rs.getInt(3));
			p.setPrice(rs.getDouble(4));
			return p;
		});
	}

	public Product getProductByIdDao(int pid) {
		try {
		return jdbcTemplate.queryForObject("select * from product_tbl where pid=?", new Object[] {pid},BeanPropertyRowMapper.newInstance(Product.class));
		}catch(EmptyResultDataAccessException E) {
			return null;
		}
	}
	
	public void addNewProductDao(Product p) {
		jdbcTemplate.update("insert into product_tbl(pid,pname,qty,price) values(?,?,?,?)",new Object[] {p.getPid(),p.getPname(),p.getQty(),p.getPrice()});		
	}

	public void editProductDao(Product p) {
		jdbcTemplate.update("update product_tbl set pname=?,qty=?,price=? where pid=?",new Object[] {p.getPname(),p.getQty(),p.getPrice(),p.getPid()});
	}
	
	public void deleteProductDao(int pid) {
		jdbcTemplate.update("delete from product_tbl where pid=?",new Object[] {pid});
	}

}
