package com.prajesh.example.demoapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prajesh.example.demoapp.dao.DemoDaoImpl;
import com.prajesh.example.demoapp.model.ProductInfo;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DemoDaoImpl demoDaoImpl;
	
	@Override
	public ProductInfo addProduct(ProductInfo productInfo) {
		
		return demoDaoImpl.saveProduct(productInfo);
	}

	@Override
	public List<ProductInfo> addBulkProduct(List<ProductInfo> productList) {
		return demoDaoImpl.saveProductList(productList);
	}

	@Override
	public List<ProductInfo> getCategoryProductList(String categoryId) {
		return demoDaoImpl.getProductList(categoryId);
	}

	@Override
	public ProductInfo getProduct(String productId) {
		return demoDaoImpl.getProduct(productId);
	}

	@Override
	public ProductInfo deleteProduct(String productId) {
		return demoDaoImpl.deleteProduct(productId);
	}

	@Override
	public List<ProductInfo> getAllProduct() {
		return demoDaoImpl.getAllProducts();
	}

}
