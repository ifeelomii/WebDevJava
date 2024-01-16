package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductDao;
import com.demo.model.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductDao pdao;

	public List<Product> showProductsService() {
		return pdao.showProductsDao();
	}

	public Product getProductByIdService(int pid) {
		return pdao.getProductByIdDao(pid);
	}

	public void editProductService(Product p) {
		pdao.editProductDao(p);		
	}
	
	public void deleteProductService(int pid) {
		pdao.deleteProductDao(pid);		
	}

	public void addNewProductService(Product p) {
		pdao.addNewProductDao(p);		
	}
}
