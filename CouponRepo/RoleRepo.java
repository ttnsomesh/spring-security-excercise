package com.example.springsecurity1.CouponRepo;

import com.example.springsecurity1.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


public interface RoleRepo extends JpaRepository<Role,Integer> {

}
