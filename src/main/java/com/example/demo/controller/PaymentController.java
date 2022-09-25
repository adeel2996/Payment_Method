package com.example.demo.controller;

import com.example.demo.model.PaymentMethodModel;
import com.example.demo.service.PaymentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0/configuration/payment-methods")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping
    public ResponseEntity<List<PaymentMethodModel>> listPaymentMethods(@RequestParam(value = "id", required = false) Integer id, @RequestParam(value = "name", required = false) String name)
            throws Exception {
        List<PaymentMethodModel> paymentMethodModels = paymentService.fetchAllPaymentMethods(id, name);
        return ResponseEntity.ok(paymentMethodModels);
    }

    @PostMapping
    public ResponseEntity<String> savePaymentMethod(@RequestBody PaymentMethodModel paymentMethodModel) {
        paymentService.savePaymentMethod(paymentMethodModel);
        return ResponseEntity.ok("ok");
    }

    @PutMapping
    public ResponseEntity<String> updatePaymentMethod(@RequestParam(value = "id") Integer id, @RequestBody PaymentMethodModel paymentMethodModel) throws Exception {
        paymentMethodModel.setId(id);
        paymentService.updatePaymentMethod(paymentMethodModel);
        return ResponseEntity.ok("ok");
    }
}
