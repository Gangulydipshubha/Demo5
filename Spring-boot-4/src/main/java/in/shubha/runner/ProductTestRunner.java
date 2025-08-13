package in.shubha.runner;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.shubha.entity.Product;
import in.shubha.repo.ProductRepository;

@Component
public class ProductTestRunner implements CommandLineRunner {

    @Autowired
    private ProductRepository repo;

    @Override
    public void run(String... args) throws Exception {

        repo.saveAll(Arrays.asList(
                new Product(10, "Pen", 200.00),
                new Product(11, "Mobile", 2500.00),
                new Product(12, "Laptop", 45000.00),
                new Product(13, "Table", 800.00)
        ));

        System.out.println("Saved Products!");

        Iterable<Product> allProducts = repo.findAll();
        allProducts.forEach(System.out::println);

        Optional<Product> opt = repo.findById(16);
        System.out.println(opt.orElse(new Product(0, "Not Found", 0.0)));
    }
}
