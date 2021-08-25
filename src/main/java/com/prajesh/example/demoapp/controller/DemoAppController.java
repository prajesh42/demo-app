package com.prajesh.example.demoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prajesh.example.demoapp.model.ProductInfo;
import com.prajesh.example.demoapp.service.DemoService;

@RestController
public class DemoAppController {

	@Autowired
	private DemoService demoService;
		
	@GetMapping("/demo")
	public String getStatus() {
		return "Welcome to the demo application";
	}
	
	@PostMapping("/product")
	public ResponseEntity<?> saveProduct(@RequestBody ProductInfo productInfo){
		ProductInfo addedProduct = demoService.addProduct(productInfo);
		return ResponseEntity.status(HttpStatus.CREATED).body(addedProduct);
	}
	
	@PostMapping("/product/list")
	public ResponseEntity<?> saveProductList(@RequestBody List<ProductInfo> productList){
		List<ProductInfo> bulkProduct = demoService.addBulkProduct(productList);
		return ResponseEntity.status(HttpStatus.CREATED).body(bulkProduct);
	}
	
	@PutMapping("/product")
	public ResponseEntity<?> updateProduct(@RequestBody ProductInfo productInfo){
		ProductInfo addedProduct = demoService.addProduct(productInfo);
		return ResponseEntity.status(HttpStatus.CREATED).body(addedProduct);
	}
	
	@PutMapping("/product/list")
	public ResponseEntity<?> updateProductList(@RequestBody List<ProductInfo> productList){
		List<ProductInfo> bulkProduct = demoService.addBulkProduct(productList);
		return ResponseEntity.status(HttpStatus.CREATED).body(bulkProduct);
	}
	
	@GetMapping("/product/{productId}")
	public ResponseEntity<?> getProduct(@PathVariable("productId") String productId){
		ProductInfo productInfo = demoService.getProduct(productId);
		return ResponseEntity.status(HttpStatus.OK).body(productInfo);
	}
	
	@GetMapping("/product/list/{categoryId}")
	public ResponseEntity<?> getProductList(@PathVariable("categoryId") String categoryId){
		List<ProductInfo> categoryProductList = demoService.getCategoryProductList(categoryId);
		return ResponseEntity.status(HttpStatus.OK).body(categoryProductList);
	}
	
	@GetMapping("/product/list")
	public ResponseEntity<?> getAllProductList(){
		List<ProductInfo> categoryProductList = demoService.getAllProduct();
		return ResponseEntity.status(HttpStatus.OK).body(categoryProductList);
	}
	
	@DeleteMapping("/product/{productId}")
	public ResponseEntity<?> deleteProduct(@PathVariable("productId") String productId){
		ProductInfo productInfo = demoService.deleteProduct(productId);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(productInfo);
	}
	
	
}
