package com.designpattern.designpattern.factory.abstracts;

import org.springframework.context.annotation.Configuration;

import com.designpattern.designpattern.factory.abstracts.gopay.GopayCancelPaymentRequest;
import com.designpattern.designpattern.factory.abstracts.gopay.GopayChargePaymentRequest;
import com.designpattern.designpattern.factory.abstracts.gopay.GopayGetBalancePaymentRequest;

@Configuration
public class GopayPaymentFactory implements IPaymentFactory {

    @Override
    public IChargePaymentRequest createChargePaymentRequest() {
        return new GopayChargePaymentRequest();
    }

    @Override
    public ICancelPaymentRequest createCancelPaymentRequest() {
        return new GopayCancelPaymentRequest();
    }

    @Override
    public IGetBalancePaymentRequest createGetBalancePaymentRequest() {
        return new GopayGetBalancePaymentRequest();
    }

}
