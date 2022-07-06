package cricket.player.cricket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cricket.player.cricket.entity.Product;
import cricket.player.cricket.service.ProductService;

@RestController
public class ProductControllerr {
	@Autowired
	private ProductService service;
	
	
	@PostMapping("/addProducts")
	 public Product addProduct(@RequestBody Product product) {
		 return service.SaveProduct(product);
	 }
	@PostMapping("/addProducts")
	 public List<Product>addProduct(@RequestBody List<Product>Products){
		 return service.SaveProducts(Products);
	 }
	@GetMapping("/products")
	public List<Product>findAllProducts(){
		return service.getproducts();
	}
	@GetMapping("/product/{id}")
	public Product findProductById(@PathVariable int id) {
		return service.getproductById(id);
		
		}
	
     @GetMapping("/product/{name}")
	public Product findPrductByName(@PathVariable String name) {
		return service.getProductByName(name);	}
 	
 	@PutMapping("/update")
 	 public Product updateProduct(@RequestBody Product product) {
 		 return service.updateProduct(product);
 	 }
 	@DeleteMapping("/delete/{id}")
 	public String deleteProduct(@PathVariable int id) {
 		return service.deleteProduct(id);
 	}
}
