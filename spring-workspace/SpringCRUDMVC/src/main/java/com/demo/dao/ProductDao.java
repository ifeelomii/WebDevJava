package com.demo.dao;

import java.util.List;
import com.demo.model.*;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Product> findAllProduct(){
		return jdbcTemplate.query("select * from product_tbl", (rs,num) -> {
			Product p = new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setQty(rs.getInt(3));
			p.setPrice(rs.getDouble(4));
			//System.out.println(p);
			return p;
		});
	}

	public void addProductDao(Product p) {
		jdbcTemplate.update("insert into product_tbl values(?,?,?,?)", new Object[] 
				{p.getPid(),p.getPname(),p.getQty(),p.getPrice()});
	}
	
	public void editProductDao(Product p) {
		jdbcTemplate.update("update product_tbl set pname=?,qty=?,price=? where pid=?", new Object[] 
				{p.getPname(),p.getQty(),p.getPrice(),p.getPid()});
	}
	
	public void deleteProductDao(int id) {
		jdbcTemplate.update("delete from product_tbl where pid=?", new Object[] {id});
	}

	public Product getByIdDao(int pid) {
		try {
		    return jdbcTemplate.queryForObject("select * from product_tbl where pid=?",new Object[] {pid},BeanPropertyRowMapper.newInstance(Product.class));
		}catch(EmptyResultDataAccessException e) {
			return null;
		}
	}
}
