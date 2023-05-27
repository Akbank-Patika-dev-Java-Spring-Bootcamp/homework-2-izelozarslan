package com.izelozarslan.homework2.controller.contract;

import com.izelozarslan.homework2.dto.ProductDTO;
import com.izelozarslan.homework2.dto.ProductSaveRequest;
import com.izelozarslan.homework2.dto.ProductUpdatePriceRequest;
import com.izelozarslan.homework2.entity.Product;

import java.util.List;

public interface ProductControllerContract {

    ProductDTO save(ProductSaveRequest productSaveRequest);

    List<ProductDTO> findAll();

    ProductDTO findById(Long id);

    void deleteById(Long id);

    Product updatePriceById(Long id, ProductUpdatePriceRequest productUpdatePriceRequest);
}
