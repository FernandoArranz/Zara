package com.example.zara.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "prices")
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "brand_id")
    private Integer brandId;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;

    @Column(name = "price_list")
    private Integer priceList;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "priority")
    private Integer priority;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "curr")
    private String curr;

    protected Price() {}

    public Price(Long id, Integer brandId, LocalDateTime startDate, LocalDateTime endDate, Integer priceList,
                 Integer productId, Integer priority, BigDecimal price, String curr) {
        this.id = id;
        this.brandId = brandId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.priceList = priceList;
        this.productId = productId;
        this.priority = priority;
        this.price = price;
        this.curr = curr;
    }

    public static class Builder {
        private Long id;
        private Integer brandId;
        private LocalDateTime startDate;
        private LocalDateTime endDate;
        private Integer priceList;
        private Integer productId;
        private Integer priority;
        private BigDecimal price;
        private String curr;

        public Builder id(Long id) { this.id = id; return this; }
        public Builder brandId(Integer brandId) { this.brandId = brandId; return this; }
        public Builder startDate(LocalDateTime startDate) { this.startDate = startDate; return this; }
        public Builder endDate(LocalDateTime endDate) { this.endDate = endDate; return this; }
        public Builder priceList(Integer priceList) { this.priceList = priceList; return this; }
        public Builder productId(Integer productId) { this.productId = productId; return this; }
        public Builder priority(Integer priority) { this.priority = priority; return this; }
        public Builder price(BigDecimal price) { this.price = price; return this; }
        public Builder curr(String curr) { this.curr = curr; return this; }
        public Price build() { return new Price(id, brandId, startDate, endDate, priceList, productId, priority, price, curr); }
    }
}