package cricket.player.cricket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cricket.player.cricket.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

	Product findByName(String name);

}
