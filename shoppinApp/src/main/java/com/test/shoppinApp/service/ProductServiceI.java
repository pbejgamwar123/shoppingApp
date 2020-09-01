package com.test.shoppinApp.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.test.shoppinApp.model.Product;


public interface ProductServiceI {
	
	Product addproduct (Product product);
	
	List<Product> showAll();

}
