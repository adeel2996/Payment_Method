package com.example.demo.mapper;

import com.example.demo.entity.PaymentMethod;
import com.example.demo.model.PaymentMethodModel;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface PaymentMapper {

    static PaymentMapper getInstance() {
        return Mappers.getMapper(PaymentMapper.class);
    }

    @Mapping(target = "id", ignore = true)
    public PaymentMethod toPaymentMethod(PaymentMethodModel paymentMethodModel);

    public PaymentMethodModel toPaymentMethodModel(PaymentMethod paymentMethod);

    public List<PaymentMethodModel> toPaymentMethodModelList(List<PaymentMethod> paymentMethods);
}
