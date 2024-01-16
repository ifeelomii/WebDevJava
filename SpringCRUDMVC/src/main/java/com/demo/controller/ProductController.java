package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Product;
import com.demo.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService pserv;
	
	
	@GetMapping("/allproducts")
	public ModelAndView ShowAllProducts() {
		List<Product> plist = pserv.GetAllProductsService();
		return new ModelAndView("products","plist",plist);
	}
	
	@GetMapping("/addproduct")
	public String addProduct() {
		return "addproduct";
	}
	
	@PostMapping("/addproduct")
	public ModelAndView addProduct(int pid, String pname, int qty, double price) {
		Product p = new Product();
		p.setPid(pid);
		p.setPname(pname);
		p.setQty(qty);
		p.setPrice(price);
		pserv.addProductService(p);
		String s = "added successfully";
		return new ModelAndView("redirect:/product/allproducts","msg",s);
	}
	
	@GetMapping("/delete")
	public String deleteProduct() {
		return "delete";
	}
	
	@PostMapping("/delete")
	public ModelAndView deleteProduct(int pid) {
		pserv.deleteProductService(pid);
		String s = "deleted successfully";
		return new ModelAndView("redirect:/product/allproducts");
	}
	
	@GetMapping("/edit")
	public String editProduct() {
		return "edit";
	}
	
	
	@PostMapping("/edit")
	public ModelAndView editProduct(Product p) {
		pserv.editProductService(p);
		String s = "edited successfully";
		return new ModelAndView("redirect:/product/allproducts");
	}
}
