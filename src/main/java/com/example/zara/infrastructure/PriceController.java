package com.example.zara.infrastructure;

import com.example.zara.application.PriceServiceImpl;
import com.example.zara.domain.Price;
import com.example.zara.dto.PriceDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/prices")
public class PriceController {
    private final PriceServiceImpl priceService;

    public PriceController(PriceServiceImpl priceService) {
        this.priceService = priceService;
    }

    @GetMapping
    public PriceDTO getPrice(@RequestParam Integer productId,
                             @RequestParam Integer brandId,
                             @RequestParam String applicationDate) {
        LocalDateTime dateTime = LocalDateTime.parse(applicationDate);
        Price price = priceService.getPrice(productId, brandId, dateTime);

        return new PriceDTO(price.getProductId(), price.getBrandId(), price.getPriceList(),
                price.getStartDate(), price.getEndDate(), price.getPrice());
    }
}