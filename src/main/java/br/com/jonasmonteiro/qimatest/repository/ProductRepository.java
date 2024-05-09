package br.com.jonasmonteiro.qimatest.repository;

import br.com.jonasmonteiro.qimatest.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAll();
    Product save(Product product);
    Product saveAndFlush(Product product);
    void deleteById(Long id);
}

