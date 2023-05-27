package com.izelozarslan.homework2.repository;

import com.izelozarslan.homework2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
