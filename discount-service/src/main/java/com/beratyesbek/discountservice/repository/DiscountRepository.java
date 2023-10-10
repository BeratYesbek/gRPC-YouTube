package com.beratyesbek.discountservice.repository;

import com.beratyesbek.discountservice.entity.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountRepository extends JpaRepository<Discount, Integer> {
}
