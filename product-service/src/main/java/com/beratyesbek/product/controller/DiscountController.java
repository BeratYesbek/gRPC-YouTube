package com.beratyesbek.product.controller;

import com.beratyesbek.grpc.DiscountResponse;
import com.beratyesbek.product.model.dto.DiscountResponseDTO;
import com.beratyesbek.product.service.DiscountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/discounts")
public class DiscountController {

    private final DiscountService discountService;

    @GetMapping
    public ResponseEntity<DiscountResponseDTO> getDiscount(int productId, String code) {
        DiscountResponse discountResponse = discountService.getDiscount(productId,code);
        return ResponseEntity.ok(
                DiscountResponseDTO.builder()
                        .newPrice(discountResponse.getNewPrice())
                        .oldPrice(discountResponse.getOldPrice())
                        .code(discountResponse.getCode())
                        .build()
        );

    }
}
