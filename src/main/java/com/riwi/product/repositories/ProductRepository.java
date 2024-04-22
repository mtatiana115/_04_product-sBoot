package com.riwi.product.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.product.entities.Product;

@Repository
//extender de JpaRepositorr<Entidad Tipo_dato>
public interface ProductRepository extends JpaRepository<Product, Long> {
  //creo el método
public Product findByName(String name);
}
