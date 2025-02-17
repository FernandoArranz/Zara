package com.example.zara;

import com.example.zara.domain.Price;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Utils {
    public static Price getPrice1() {
        return Price.builder()
                .brandId(1)
                .startDate(LocalDateTime.parse("2020-06-14T00:00:00"))
                .endDate(LocalDateTime.parse("2020-12-31T23:59:59"))
                .priceList(1)
                .productId(35455)
                .price(new BigDecimal("35.5"))
                .build();
    }

    public static Price getPrice2() {
        return Price.builder()
                .brandId(1)
                .startDate(LocalDateTime.parse("2020-06-14T15:00:00"))
                .endDate(LocalDateTime.parse("2020-06-14T18:30:00"))
                .priceList(2)
                .productId(35455)
                .price(new BigDecimal("25.45"))
                .build();
    }

    public static Price getPrice3() {
        return Price.builder()
                .brandId(1)
                .startDate(LocalDateTime.parse("2020-06-15T00:00:00"))
                .endDate(LocalDateTime.parse("2020-06-15T11:00:00"))
                .priceList(3)
                .productId(35455)
                .price(new BigDecimal("30.5"))
                .build();
    }

    public static Price getPrice4() {
        return Price.builder()
                .brandId(1)
                .startDate(LocalDateTime.parse("2020-06-15T16:00:00"))
                .endDate(LocalDateTime.parse("2020-12-31T23:59:59"))
                .priceList(4)
                .productId(35455)
                .price(new BigDecimal("38.95"))
                .build();
    }
}
