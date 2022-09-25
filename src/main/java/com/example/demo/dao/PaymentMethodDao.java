package com.example.demo.dao;

import com.example.demo.entity.PaymentMethod;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentMethodDao extends JpaRepository<PaymentMethod, Integer> {

    @Query(value = "FROM PaymentMethod pm WHERE LOWER(pm.name) = LOWER(:name)")
    List<PaymentMethod> findByName(@Param("name") String name);

}
