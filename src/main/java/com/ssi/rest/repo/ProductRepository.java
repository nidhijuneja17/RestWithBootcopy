package com.ssi.rest.repo;

import org.springframework.data.repository.CrudRepository;

import com.ssi.rest.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
