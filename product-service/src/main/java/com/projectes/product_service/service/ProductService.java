package com.projectes.product_service.service;

import com.projectes.product_service.repository.ProductDTO;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final EntityManager entityManager;

    @Autowired
    public ProductService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public ProductDTO getProductById(Long productId) {
        return entityManager.find(ProductDTO.class, productId);
    }
}
