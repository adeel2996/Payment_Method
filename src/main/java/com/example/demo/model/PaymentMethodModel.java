package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigDecimal;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentMethodModel {

    private Integer id;
    private String name;
    private String displayName;
    private String paymentType;
    List<PaymentPlanModel> paymentPlans;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class PaymentPlanModel {
        private Integer id;
        private BigDecimal netAmount;
        private BigDecimal taxAmount;
        private BigDecimal grossAmount;
        private String currency;
        private String duration;
    }

}
