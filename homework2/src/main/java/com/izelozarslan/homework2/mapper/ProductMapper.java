package com.izelozarslan.homework2.mapper;

import com.izelozarslan.homework2.dto.ProductDTO;
import com.izelozarslan.homework2.dto.ProductSaveRequest;
import com.izelozarslan.homework2.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    Product convertToProduct(ProductSaveRequest productSaveRequest);

    ProductDTO convertToProductDTO(Product product);
}
