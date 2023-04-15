package com.designpattern.designpattern.factory.abstracts;

public interface IChargePaymentRequest {
    String getId();

    void setId(String id);

    Long getAmount();

    void setAmount(Long amount);

    Long getFee();

    EPaymentMethod getMethod();
}
