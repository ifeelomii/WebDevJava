package com.demo.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.Product;
import com.demo.service.ProductService;

@Controller
@RequestMapping("/")
public class ProductController {

	@Autowired
	private ProductService pservice;
	
	//get all products
	@GetMapping("/product")
	public ResponseEntity<List<Product>> showProducts() {
		return ResponseEntity.ok(pservice.showProductsService());
	}
	
	//get product by id
	@GetMapping("/product/{pid}")
	public ResponseEntity<Product> getProductById(@PathVariable int pid){
		Product p = pservice.getProductByIdService(pid);
		if(p!=null)
			return ResponseEntity.ok(p);
		else
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
	
	//add product
	@PostMapping("/product/{pid}")
	public ResponseEntity<String> addNewProduct(@RequestBody Product p){
		pservice.addNewProductService(p);
		return ResponseEntity.ok("Added Successfully");
	}
	
	//edit product
	@PutMapping("/product/{pid}")
	public ResponseEntity<String> editProduct(@RequestBody Product p){
		pservice.editProductService(p);
		return ResponseEntity.ok("Updated Successfully");
	}
	
	//delete product
	@DeleteMapping("/product/{pid}")
	public ResponseEntity<String> deleteProduct(@PathVariable int pid){
		pservice.deleteProductService(pid);
		return ResponseEntity.ok("Deleted Successfully");
	}
	
}
