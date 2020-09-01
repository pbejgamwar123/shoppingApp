package com.test.shoppinApp.controller;



import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

import org.aspectj.weaver.ast.Var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.test.shoppinApp.model.Product;
import com.test.shoppinApp.service.ProductServiceI;
@CrossOrigin(origins="*")
@RestController
@RequestMapping("/productCont")
public class ProductController {
	
	@Autowired
	private ProductServiceI prodService;
	
	
	@PostMapping("/add")
	public String addProduct(@RequestBody Product product) {
		System.out.println(product);
		prodService.addproduct(product);
		return "Added";
		
	}
	
	

	@GetMapping("/showAllProducts")
	public List<Product> showAll()
	{
		List<Product>list=prodService.showAll();
		return list ;
		
	}

	 @RequestMapping(value = "/uploadImage", method = RequestMethod.GET,
	            produces = MediaType.IMAGE_JPEG_VALUE)
	    public ResponseEntity<byte[]> getImage() throws IOException {

	        ClassPathResource imgFile = new ClassPathResource("image/VivoCellphone.jpg");
	        byte[] bytes = StreamUtils.copyToByteArray(imgFile.getInputStream());

	        return ResponseEntity
	                .ok()
	                .contentType(MediaType.IMAGE_JPEG)
	                .body(bytes);
	    }
	
}

