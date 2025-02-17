package com.example.zara;

import com.example.zara.dto.PriceDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ZaraApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void test1() {
		ResponseEntity<PriceDTO> response = restTemplate.getForEntity("/prices?productId=35455&brandId=1&applicationDate=2020-06-14T10:00:00", PriceDTO.class);
		assertEquals(Utils.getPrice1().getProductId(), Objects.requireNonNull(response.getBody()).productId());
		assertEquals(Utils.getPrice1().getBrandId(), Objects.requireNonNull(response.getBody()).brandId());
		assertEquals(Utils.getPrice1().getPriceList(), Objects.requireNonNull(response.getBody()).priceList());
		assertEquals(Utils.getPrice1().getStartDate(), Objects.requireNonNull(response.getBody()).startDate());
		assertEquals(Utils.getPrice1().getEndDate(), Objects.requireNonNull(response.getBody()).endDate());
		assertEquals(Utils.getPrice1().getPrice(), Objects.requireNonNull(response.getBody()).price());
	}

	@Test
	void test2() {
		ResponseEntity<PriceDTO> response = restTemplate.getForEntity("/prices?productId=35455&brandId=1&applicationDate=2020-06-14T16:00:00", PriceDTO.class);
		assertEquals(Utils.getPrice2().getProductId(), Objects.requireNonNull(response.getBody()).productId());
		assertEquals(Utils.getPrice2().getBrandId(), Objects.requireNonNull(response.getBody()).brandId());
		assertEquals(Utils.getPrice2().getPriceList(), Objects.requireNonNull(response.getBody()).priceList());
		assertEquals(Utils.getPrice2().getStartDate(), Objects.requireNonNull(response.getBody()).startDate());
		assertEquals(Utils.getPrice2().getEndDate(), Objects.requireNonNull(response.getBody()).endDate());
		assertEquals(Utils.getPrice2().getPrice(), Objects.requireNonNull(response.getBody()).price());
	}

	@Test
	void test3() {
		ResponseEntity<PriceDTO> response = restTemplate.getForEntity(
				"/prices?productId=35455&brandId=1&applicationDate=2020-06-14T21:00:00", PriceDTO.class);
		assertEquals(Utils.getPrice1().getProductId(), Objects.requireNonNull(response.getBody()).productId());
		assertEquals(Utils.getPrice1().getBrandId(), Objects.requireNonNull(response.getBody()).brandId());
		assertEquals(Utils.getPrice1().getPriceList(), Objects.requireNonNull(response.getBody()).priceList());
		assertEquals(Utils.getPrice1().getStartDate(), Objects.requireNonNull(response.getBody()).startDate());
		assertEquals(Utils.getPrice1().getEndDate(), Objects.requireNonNull(response.getBody()).endDate());
		assertEquals(Utils.getPrice1().getPrice(), Objects.requireNonNull(response.getBody()).price());
	}

	@Test
	void test4() {
		ResponseEntity<PriceDTO> response = restTemplate.getForEntity(
				"/prices?productId=35455&brandId=1&applicationDate=2020-06-15T10:00:00", PriceDTO.class);
		assertEquals(Utils.getPrice3().getProductId(), Objects.requireNonNull(response.getBody()).productId());
		assertEquals(Utils.getPrice3().getBrandId(), Objects.requireNonNull(response.getBody()).brandId());
		assertEquals(Utils.getPrice3().getPriceList(), Objects.requireNonNull(response.getBody()).priceList());
		assertEquals(Utils.getPrice3().getStartDate(), Objects.requireNonNull(response.getBody()).startDate());
		assertEquals(Utils.getPrice3().getEndDate(), Objects.requireNonNull(response.getBody()).endDate());
		assertEquals(Utils.getPrice3().getPrice(), Objects.requireNonNull(response.getBody()).price());
	}

	@Test
	void test5() {
		ResponseEntity<PriceDTO> response = restTemplate.getForEntity(
				"/prices?productId=35455&brandId=1&applicationDate=2020-06-16T21:00:00", PriceDTO.class);
		assertEquals(Utils.getPrice4().getProductId(), Objects.requireNonNull(response.getBody()).productId());
		assertEquals(Utils.getPrice4().getBrandId(), Objects.requireNonNull(response.getBody()).brandId());
		assertEquals(Utils.getPrice4().getPriceList(), Objects.requireNonNull(response.getBody()).priceList());
		assertEquals(Utils.getPrice4().getStartDate(), Objects.requireNonNull(response.getBody()).startDate());
		assertEquals(Utils.getPrice4().getEndDate(), Objects.requireNonNull(response.getBody()).endDate());
		assertEquals(Utils.getPrice4().getPrice(), Objects.requireNonNull(response.getBody()).price());
	}

	@Test
	void testPriceNotFoundException() {
		ResponseEntity<String> response = restTemplate.getForEntity("/prices?productId=99999&brandId=1&applicationDate=2030-01-01T00:00:00", String.class);

		assertEquals("Price not found for given parameters", response.getBody());
	}
}
