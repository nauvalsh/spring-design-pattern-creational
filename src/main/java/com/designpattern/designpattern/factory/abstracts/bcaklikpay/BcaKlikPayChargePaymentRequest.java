package com.designpattern.designpattern.factory.abstracts.bcaklikpay;

import com.designpattern.designpattern.factory.abstracts.EPaymentMethod;
import com.designpattern.designpattern.factory.abstracts.IChargePaymentRequest;

public class BcaKlikPayChargePaymentRequest implements IChargePaymentRequest {

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
        return 5000L;
    }

    @Override
    public EPaymentMethod getMethod() {
        return EPaymentMethod.BCA_KLIKPAY;
    }

}
