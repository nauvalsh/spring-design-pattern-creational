package com.designpattern.designpattern.factory.abstracts;

import org.springframework.context.annotation.Configuration;

import com.designpattern.designpattern.factory.abstracts.bcaklikpay.BcaKlikPayCancelPaymentRequest;
import com.designpattern.designpattern.factory.abstracts.bcaklikpay.BcaKlikPayChargePaymentRequest;
import com.designpattern.designpattern.factory.abstracts.bcaklikpay.BcaKlikPayGetBalanceRequest;

@Configuration
public class BcaKlikPayPaymentFactory implements IPaymentFactory {

    @Override
    public IChargePaymentRequest createChargePaymentRequest() {
        return new BcaKlikPayChargePaymentRequest();
    }

    @Override
    public ICancelPaymentRequest createCancelPaymentRequest() {
        return new BcaKlikPayCancelPaymentRequest();
    }

    @Override
    public IGetBalancePaymentRequest createGetBalancePaymentRequest() {
        return new BcaKlikPayGetBalanceRequest();
    }

}
