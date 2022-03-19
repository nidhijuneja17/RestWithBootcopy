package com.ssi.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssi.rest.Product;
import com.ssi.rest.repo.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}
	
	public Product searchProductById(int code) {
		Optional <Product> optional=productRepository.findById(code);
		Product product=optional.get();
		return product;
	}
	
	public List<Product> getAllProducts() {
		return (List<Product>)productRepository.findAll();
	}
	
	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}
	
	public Product deleteProductById(int code) {
		Product product=searchProductById(code);
		productRepository.deleteById(code);
		return product;
	}
	
}
