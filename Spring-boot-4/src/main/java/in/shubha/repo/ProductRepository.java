package in.shubha.repo;

import org.springframework.data.repository.CrudRepository;

import in.shubha.entity.Product;

public interface ProductRepository extends CrudRepository<Product,Integer> {

}
