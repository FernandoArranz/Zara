package com.example.zara.dto;

import lombok.Builder;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PriceDTO(Integer productId, Integer brandId, Integer priceList,
                       LocalDateTime startDate, LocalDateTime endDate, BigDecimal price) {

    @Builder
    public static PriceDTO of(Integer productId, Integer brandId, Integer priceList,
                              LocalDateTime startDate, LocalDateTime endDate, BigDecimal price) {
        return new PriceDTO(productId, brandId, priceList, startDate, endDate, price);
    }
}
