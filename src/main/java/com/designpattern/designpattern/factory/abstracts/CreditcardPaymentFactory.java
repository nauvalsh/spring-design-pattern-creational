package com.designpattern.designpattern.factory.abstracts;

import org.springframework.context.annotation.Configuration;

import com.designpattern.designpattern.factory.abstracts.creditcard.CreditcardCancelPaymentRequest;
import com.designpattern.designpattern.factory.abstracts.creditcard.CreditcardChargePaymentRequest;
import com.designpattern.designpattern.factory.abstracts.creditcard.CreditcardGetBalancePaymentRequest;

@Configuration
public class CreditcardPaymentFactory implements IPaymentFactory {

    @Override
    public IChargePaymentRequest createChargePaymentRequest() {
        return new CreditcardChargePaymentRequest();
    }

    @Override
    public ICancelPaymentRequest createCancelPaymentRequest() {
        return new CreditcardCancelPaymentRequest();
    }

    @Override
    public IGetBalancePaymentRequest createGetBalancePaymentRequest() {
        return new CreditcardGetBalancePaymentRequest();
    }

}
