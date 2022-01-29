package com.ecommerce.microisocommerce.web.doa;

import com.ecommerce.microisocommerce.web.model.Product;

import java.util.List;

public interface ProductDao {
    List<Product> findAll();
    Product findById(int id);
    Product save(Product product);


}
