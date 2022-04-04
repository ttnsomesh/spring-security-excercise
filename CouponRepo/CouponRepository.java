package com.example.springsecurity1.CouponRepo;


import com.example.springsecurity1.Entity.Coupon;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository  extends JpaRepository<Coupon,Integer> {
     Coupon findByCode(String code);
}
