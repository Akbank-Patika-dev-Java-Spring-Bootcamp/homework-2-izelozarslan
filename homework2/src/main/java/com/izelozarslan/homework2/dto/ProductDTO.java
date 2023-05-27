package com.izelozarslan.homework2.dto;

import java.math.BigDecimal;

public record ProductDTO(Long id,
                         String name,
                         BigDecimal price,
                         String description
                         ) {
}
