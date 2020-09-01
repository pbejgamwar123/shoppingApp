package com.test.shoppinApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.shoppinApp.dao.ProductDaoI;
import com.test.shoppinApp.model.Product;
@Service
public class ProductServiceImpl implements ProductServiceI {

	@Autowired
	private ProductDaoI prod;
	
	
	@Override
	public Product addproduct(Product product) {
		// TODO Auto-generated method stub
		Product p=prod.save(product);
		
		return p;
	}


	@Override
	public List<Product> showAll() {
		// TODO Auto-generated method stub
		
		List<Product> list=prod.findAll();
		return list;
		
	}
	
	

}
