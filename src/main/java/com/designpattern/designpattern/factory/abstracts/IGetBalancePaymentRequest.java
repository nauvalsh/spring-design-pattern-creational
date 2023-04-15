package com.designpattern.designpattern.factory.abstracts;

public interface IGetBalancePaymentRequest {
    String getUserId();

    void setUserId(String userId);

    EPaymentMethod getMethod();
}
