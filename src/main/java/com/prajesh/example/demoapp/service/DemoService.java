package com.prajesh.example.demoapp.service;

import java.util.List;

import com.prajesh.example.demoapp.model.ProductInfo;

public interface DemoService {

	public ProductInfo addProduct(ProductInfo productInfo);
	
	public List<ProductInfo> addBulkProduct(List<ProductInfo> productList);
	
	public List<ProductInfo> getCategoryProductList(String categoryId);
	
	public ProductInfo getProduct(String productId);
	
	public ProductInfo deleteProduct(String productId);
}
