package com.prajesh.example.demoapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.prajesh.example.demoapp.model.ProductInfo;

@Component
public class DemoDaoImpl {

	@Autowired
	private DemoDao demoDao;
	
	public ProductInfo saveProduct(ProductInfo productInfo) {
		return demoDao.save(productInfo);
	}
	
	public List<ProductInfo> saveProductList(List<ProductInfo> productList) {
		return (List<ProductInfo>) demoDao.saveAll(productList);
	}
	
	public List<ProductInfo> getProductList(String categoryId){
		return demoDao.findByCategoryId(categoryId);
	}
	
	public List<ProductInfo> getAllProducts(){
		return (List<ProductInfo>) demoDao.findAll();
	}
	
	public ProductInfo getProduct(String productId) {
		return demoDao.findByProductId(productId);
	}
	
	public ProductInfo deleteProduct(String productId) {
		return demoDao.deleteByProductId(productId);
	}
	
}
