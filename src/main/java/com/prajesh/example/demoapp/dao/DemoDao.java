package com.prajesh.example.demoapp.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.prajesh.example.demoapp.model.ProductInfo;

public interface DemoDao extends CrudRepository<ProductInfo,Integer> {

	public List<ProductInfo> findByCategoryId(String categoryId);
	public ProductInfo findByProductId(String productId);
	public ProductInfo deleteByProductId(String productId);
}
