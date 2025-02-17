package com.example.zara.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PriceDTO(Integer productId, Integer brandId, Integer priceList,
                       LocalDateTime startDate, LocalDateTime endDate, BigDecimal price) { }
