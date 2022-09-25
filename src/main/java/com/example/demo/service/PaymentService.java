package com.example.demo.service;

import com.example.demo.dao.PaymentMethodDao;
import com.example.demo.dao.PaymentPlanDao;
import com.example.demo.entity.PaymentMethod;
import com.example.demo.mapper.PaymentMapper;
import com.example.demo.model.PaymentMethodModel;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;
    @Autowired
    private PaymentMethodDao paymentMethodDao;
    @Autowired
    private PaymentPlanDao paymentPlanDao;

    public void savePaymentMethod(PaymentMethodModel paymentMethodModelRequest) {
        PaymentMethod paymentMethod = paymentMapper.toPaymentMethod(paymentMethodModelRequest);
        PaymentMethod savedPaymentMethod = paymentMethodDao.save(paymentMethod);
    }

    public void updatePaymentMethod(PaymentMethodModel paymentMethodModelRequest) throws Exception {
        PaymentMethod paymentMethod = paymentMethodDao.findById(paymentMethodModelRequest.getId()).orElseThrow(() -> new Exception("Record Not found against id " + paymentMethodModelRequest.getId()));
        PaymentMethod updatedPaymentMethod = paymentMapper.toPaymentMethod(paymentMethodModelRequest);
        updatedPaymentMethod.setId(paymentMethod.getId());
        paymentMethodDao.save(updatedPaymentMethod);
    }

    public List<PaymentMethodModel> fetchAllPaymentMethods(Integer id, String name) throws Exception {
        List<PaymentMethod> paymentMethods = new ArrayList<>();
        if (id != null)
        {
            PaymentMethod paymentMethod = paymentMethodDao.findById(id).orElseThrow(() -> new Exception("Record Not found against id " + id));
            paymentMethods.add(paymentMethod);
        } else if (name != null) {
            paymentMethods = paymentMethodDao.findByName(name);
        } else {
            paymentMethods = paymentMethodDao.findAll();
        }
        return paymentMapper.toPaymentMethodModelList(paymentMethods);
    }


}
