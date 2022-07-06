package cricket.player.cricket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cricket.player.cricket.entity.Product;
import cricket.player.cricket.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;
	 public Product SaveProduct(Product product) {
				return repository.save(product);
				 
			 }
    public List<Product> SaveProducts(List<Product> Products) {
    	return repository.saveAll(Products);
    	

}
    public List<Product>getproducts(){
    	return repository.findAll();    
    	}

    public Product getproductById(int id){
	return repository.getById(id);    }

   public Product getProductByName(String name) {
	return repository.findByName(name);
}
   public String deleteProduct(int id) {
	   repository.deleteById(id);
	   return "Product Remove || " +id;
   }
   public Product updateProduct(Product product)
   {
	   Product existingProduct=repository.findAllById(product.getId());
	   existingProduct.setName(product.getName());
	   existingProduct.setRunscored(product.getRunscored());
	   existingProduct.setPlayerType(product.getPlayerType());
	   existingProduct.setId(product.getId());
	   return repository.save(existingProduct);
	   }
}
