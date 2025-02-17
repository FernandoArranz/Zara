package com.example.zara.domain;

import java.time.LocalDateTime;

public interface PriceService {
    Price getPrice(Integer productId, Integer brandId, LocalDateTime applicationDate);
}
