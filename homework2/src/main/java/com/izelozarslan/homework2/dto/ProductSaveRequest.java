package com.izelozarslan.homework2.dto;

import java.math.BigDecimal;

public record ProductSaveRequest(String name,
                                 BigDecimal price,
                                 String description
                                 ) {
}
