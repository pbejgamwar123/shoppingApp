package com.test.shoppinApp.model;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
 
@Entity
//@Table(name="image_model")
public class ImageModel {
  @Id
  @GeneratedValue(strategy =GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
  
    @Column(name = "name")
  private String name;
    
    @Column(name = "type")
  private String type;
    
    @Column(name = "size")
    private int size;
  
  
    public ImageModel(Long id, String name, String type, int size, String pic) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.size = size;
		this.pic = pic;
	}

	@Column(name="pic")
    private String pic;
	
	public ImageModel()
	{
		
	}
  
  public int getSize() {
	return size;
}

public void setSize(int size) {
	this.size = size;
}


  
  public Long getId(){
    return this.id;
  }
  
  public void setId(Long id){
    this.id = id;
  }
  
  public String getName(){
    return this.name;
  }
  
  public void setName(String name){
    this.name = name;
  }
  
  public String getType(){
    return this.type;
  }
  
  public void setType(String type){
    this.type = type;
  }

public String getPic() {
	return pic;
}

public void setPic(String pic) {
	this.pic = pic;
}
  

}