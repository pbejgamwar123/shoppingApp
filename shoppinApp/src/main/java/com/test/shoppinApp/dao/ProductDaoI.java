package com.test.shoppinApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.shoppinApp.model.Product;


@Repository
public interface ProductDaoI extends JpaRepository<Product, Long> {

}
