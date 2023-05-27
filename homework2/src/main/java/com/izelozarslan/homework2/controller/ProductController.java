package com.izelozarslan.homework2.controller;

import com.izelozarslan.homework2.controller.contract.ProductControllerContract;
import com.izelozarslan.homework2.dto.ProductDTO;
import com.izelozarslan.homework2.dto.ProductSaveRequest;
import com.izelozarslan.homework2.general.RestResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductControllerContract productControllerContract;

    @PostMapping
    public ResponseEntity<RestResponse<ProductDTO>> save(ProductSaveRequest productSaveRequest){
        var productDTO = productControllerContract.save(productSaveRequest);
        return ResponseEntity.ok(RestResponse.of(productDTO));
    }
}

//    Ürün controller ında;
//        1.1.Ürün kaydeden bir servis yazınız.
//        1.2.Ürünleri listeleyebilen bir servis yazınız.
//        1.3.Ürün idsinden ürünü bulan bir servis yazınız.
//        1.4.Ürün silen bir metot yazınız.
//        1.5.Ürün fiyatı güncelleyen bir metot yazınız. (Sadece fiyat)
