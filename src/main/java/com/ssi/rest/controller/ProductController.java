package com.ssi.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssi.rest.Product;
import com.ssi.rest.service.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@DeleteMapping("{code}")
	public Product removeProduct(@PathVariable("code") int id) {
		return productService.deleteProductById(id);
	}
	
	@PutMapping
	public Product modifyProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}
	
	@PostMapping
	public Product addNewProduct(Product product) {
		return productService.saveProduct(product);
	}
	
	@GetMapping
	public List<Product> showAllProducts(){
		return productService.getAllProducts();
	}
	
	@GetMapping("{code}")
	public Product showProductByCode(@PathVariable("code") int code) {
		return productService.searchProductById(code);
	}
}
