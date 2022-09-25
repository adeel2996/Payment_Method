package com.example.demo.entity;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PAYMENT_PLAN")
public class PaymentPlan {

    @Id
    @GeneratedValue
    @Column(name="PAYMENT_PLAN_ID")
    private Integer id;

    @Column(name = "NET_AMOUNT")
    private BigDecimal netAmount;

    @Column(name = "TAX_AMOUNT")
    private BigDecimal taxAmount;

    @Column(name = "GROSS_AMOUNT")
    private BigDecimal grossAmount;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "DURATION")
    private String duration;

//    @ManyToOne
//    @JoinColumn(name = "PAYMENT_METHOD_ID")
//    private PaymentMethod paymentMethod;

}
