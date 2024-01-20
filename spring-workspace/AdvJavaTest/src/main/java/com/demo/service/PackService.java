package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.PackDao;
import com.demo.model.Pack;

@Service
public class PackService {

	@Autowired
	private PackDao pdao;
	
	public List<Pack> showAllService(){
		return pdao.showAllDao();
	}
	
	public Pack getByIdService(String cust_no) {
		return pdao.getByIdDao(cust_no);
	}
	
	public void addPackService(Pack p) {
		pdao.addPackDao(p);
	}
	
	public void editPackService(Pack p) {
		pdao.editPackDao(p);
	}
	
	public void deletePackSerivce(String cust_no) {
		pdao.deletePackDao(cust_no);
	}
	
}
