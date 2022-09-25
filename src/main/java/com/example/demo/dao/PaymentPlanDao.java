package com.example.demo.dao;

import com.example.demo.entity.PaymentMethod;
import com.example.demo.entity.PaymentPlan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentPlanDao extends JpaRepository<PaymentPlan, Integer> {

}
