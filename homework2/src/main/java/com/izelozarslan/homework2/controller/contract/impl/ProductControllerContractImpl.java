package com.izelozarslan.homework2.controller.contract.impl;

import com.izelozarslan.homework2.controller.contract.ProductControllerContract;
import com.izelozarslan.homework2.dto.ProductDTO;
import com.izelozarslan.homework2.dto.ProductSaveRequest;
import com.izelozarslan.homework2.dto.ProductUpdatePriceRequest;
import com.izelozarslan.homework2.entity.Product;
import com.izelozarslan.homework2.mapper.ProductMapper;
import com.izelozarslan.homework2.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductControllerContractImpl implements ProductControllerContract {

    private final ProductService productService;
    private final ProductMapper mapper;

    @Override
    public ProductDTO save(ProductSaveRequest productSaveRequest) {
        Product product = mapper.convertToProduct(productSaveRequest);
        productService.save(product);
        return mapper.convertToProductDTO(product);

    }

    @Override
    public List<ProductDTO> findAll() {
        return null;
    }

    @Override
    public ProductDTO findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Product updatePriceById(Long id, ProductUpdatePriceRequest productUpdatePriceRequest) {
        return null;
    }
}
