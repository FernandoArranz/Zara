package com.example.zara.application;

import com.example.zara.domain.PriceRepository;
import com.example.zara.domain.PriceService;
import com.example.zara.domain.Price;
import com.example.zara.exception.PriceNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class PriceServiceImpl implements PriceService {
    private final PriceRepository priceRepository;

    public PriceServiceImpl(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    @Override
    public Price getPrice(Integer productId, Integer brandId, LocalDateTime applicationDate) {
        return priceRepository.findTopByProductIdAndBrandIdAndStartDateLessThanEqualAndEndDateGreaterThanEqualOrderByPriorityDesc(
                        productId, brandId, applicationDate, applicationDate)
                .orElseThrow(() -> new PriceNotFoundException("Price not found for given parameters"));    }
}
