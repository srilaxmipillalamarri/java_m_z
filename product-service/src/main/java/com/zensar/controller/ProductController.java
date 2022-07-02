package com.zensar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zensar.entity.Coupon;
import com.zensar.entity.CouponClassList;
import com.zensar.entity.Product;
import com.zensar.restClient.CouponRestClient;
import com.zensar.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;
	/*
	 * @Autowired private RestTemplate restTemplate;
	 */
	
	@Autowired
	private CouponRestClient restClient;
	
	@PostMapping("/")
	public Product insertProduct(@RequestBody Product product) {

		//ResponseEntity<Coupon> coupon = restTemplate.getForEntity("http://COUPON-SERVICE/coupons/" + product.getCouponCode(), Coupon.class);
		// ResponseEntity<Coupon>
		// coupon=restTemplate.getForEntity("http://localhost:1234/coupons/"+product.getCouponCode(),
		// Coupon.class, uriVariables);
		//Coupon couponObject = coupon.getBody();
		Coupon coupon = restClient.getCoupon(product.getCouponCode());
		product.setPrice(product.getPrice() - coupon.getDiscount());

		return productService.insertProduct(product);

	}
	@GetMapping("/getCoupons")
	public List<Coupon> viewCoupons() {
		List<Coupon> coupons = restClient.getAllCoupons();
		return coupons;
	}

}
