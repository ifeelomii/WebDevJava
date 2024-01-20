package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Pack;
@Repository
public class PackDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	public List<Pack> showAllDao() {
		return jdbcTemplate.query("SELECT * FROM pack_tbl", (rs,num)->{
			Pack p = new Pack();
			p.setCustNo(rs.getString(1));
			p.setBasePack(rs.getString(2));
			p.setOptPack(rs.getString(3));
			return p;
		});
	}
	
	public Pack getByIdDao(String cust_no) {
		return jdbcTemplate.queryForObject("SELECT * FROM pack_tbl WHERE cust_no=?", new Object[] {cust_no}, BeanPropertyRowMapper.newInstance(Pack.class));
	}
	
	public void addPackDao(Pack p) {
		jdbcTemplate.update("INSERT INTO prod_tbl VALUES (?,?,?)",new Object[] {p.getCustNo(),p.getBasePack(),p.getOptPack()});
	}

	public void editPackDao(Pack p) {
		jdbcTemplate.update("update prod_btl set basepack=?,optpack=? WHERE cust_no=?", new Object[] {p.getBasePack(),p.getOptPack(),p.getCustNo()});
	}
	
	public void deletePackDao(String cust_no) {
		jdbcTemplate.update("DELETE FROM prod_tbl WHERE cust_no=?", new Object[] {cust_no});
	}
}
