package com.test.shoppinApp;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;


import com.test.shoppinApp.model.ImageModel;

@SpringBootApplication
public class ShoppinAppApplication  {
	


	public static void main(String[] args) {
		SpringApplication.run(ShoppinAppApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		 // image 1
	    ClassPathResource backImgFile = new ClassPathResource("image/jsa_about_img_black_background.png");
	    byte[] arrayPic = new byte[(int) backImgFile.contentLength()];
	    backImgFile.getInputStream().read(arrayPic);
	    ImageModel blackImage = new ImageModel(1, "JSA-ABOUT-IMAGE-BLACK-BACKGROUND", "png", arrayPic);
	    
	    // image 2
		
		 * ClassPathResource blueImgFile = new
		 * ClassPathResource("image/jsa_about_img_blue_background.png"); arrayPic = new
		 * byte[(int) blueImgFile.contentLength()];
		 * blueImgFile.getInputStream().read(arrayPic); ImageModel blueImage = new
		 * ImageModel(2, "JSA-ABOUT-IMAGE-BLUE-BACKGROUND", "png", arrayPic);
		 
	    // store image to MySQL via SpringJPA
	    ImageDaoI.save(blackImage);
	    //ImageDaoI.save(blueImage);
	    
	    // retrieve image from MySQL via SpringJPA
	    for(ImageModel imageModel : ImageDaoI.findAll()){
	      Files.write(Paths.get("retrieve-dir/" + imageModel.getName() + "." + imageModel.getType()), imageModel.getPic());
	    }*/
		
	}


