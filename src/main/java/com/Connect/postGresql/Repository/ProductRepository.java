package com.Connect.postGresql.Repository;

import com.Connect.postGresql.Model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer> {
}
