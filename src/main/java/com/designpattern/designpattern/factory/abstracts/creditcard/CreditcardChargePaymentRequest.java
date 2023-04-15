package com.designpattern.designpattern.factory.abstracts.creditcard;

import com.designpattern.designpattern.factory.abstracts.EPaymentMethod;
import com.designpattern.designpattern.factory.abstracts.IChargePaymentRequest;

public class CreditcardChargePaymentRequest implements IChargePaymentRequest {

    private String id;
    private Long amount;
    private Long fee;

    @Override
    public String getId() {
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Long getAmount() {
        throw new UnsupportedOperationException("Unimplemented method 'getAmount'");
    }

    @Override
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @Override
    public Long getFee() {
        return getAmount() * 5 / 100;
    }

    @Override
    public EPaymentMethod getMethod() {
        return EPaymentMethod.CREDIT_CARD;
    }

}
