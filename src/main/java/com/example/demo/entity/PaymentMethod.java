package com.example.demo.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "PAYMENT_METHOD")
public class PaymentMethod {

    @Id
    @GeneratedValue
    @Column(name="PAYMENT_METHOD_ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DISP_NAME")
    private String displayName;

    @Column(name = "PAYMENT_TYPE")
    private String paymentType;

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<PaymentPlan> paymentPlans;

}
