package br.com.jonasmonteiro.qimatest.service;

import br.com.jonasmonteiro.qimatest.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();
    Product addProduct(Product product);
    Product findById(Long id);
    Product updateProduct(Product productDetails);
    void deleteProduct(Long id);
}
