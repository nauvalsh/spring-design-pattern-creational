package com.designpattern.designpattern.factory.abstracts;

public interface ICancelPaymentRequest {
    String getId();

    void setId(String id);

    EPaymentMethod getMethod();

}
