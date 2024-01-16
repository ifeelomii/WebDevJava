package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductDao;
import com.demo.model.Product;

@Service
public class ProductService {
	@Autowired
	ProductDao pdao;
	
	public List<Product> GetAllProductsService(){
		return pdao.findAllProduct();
	}

	public void addProductService(Product p) {
		pdao.addProductDao(p);
	}
	
	public void editProductService(Product p) {
		pdao.editProductDao(p);
	}
	
	public void deleteProductService(int id) {
		pdao.deleteProductDao(id);
	}

	public Product getByIdService(int pid) {
		return pdao.getByIdDao(pid);
	}
}
