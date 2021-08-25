package com.prajesh.example.demoapp.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prajesh.example.demoapp.model.ProductInfo;

@Repository
public interface DemoDao extends CrudRepository<ProductInfo,Integer> {

	public List<ProductInfo> findByCategoryId(String categoryId);
	public ProductInfo findByProductId(String productId);
	public ProductInfo deleteByProductId(String productId);
}
