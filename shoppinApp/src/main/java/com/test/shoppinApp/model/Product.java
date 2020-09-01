/*package com.test.model;

public class Products {

}*/

//package com.example.restservice;

package com.test.shoppinApp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column 
	private int id;
	@Column 
	private String name;
	@Column 
	private String description;
	
	@OneToOne(cascade= CascadeType.ALL)
	private ImageModel Image;
	
	public Product()
	{
		
	}
	

	public ImageModel getImage() {
		return Image;
	}

	public void setImage(ImageModel image) {
		Image = image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + "]";
	}

	public Product(int id, String name, String description, ImageModel image) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		Image = image;
	}

	
	
	


	
	
}
