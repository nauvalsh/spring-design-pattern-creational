package com.designpattern.designpattern.factory.abstracts;

public interface IPaymentFactory {
    IChargePaymentRequest createChargePaymentRequest();

    ICancelPaymentRequest createCancelPaymentRequest();

    IGetBalancePaymentRequest createGetBalancePaymentRequest();
}
