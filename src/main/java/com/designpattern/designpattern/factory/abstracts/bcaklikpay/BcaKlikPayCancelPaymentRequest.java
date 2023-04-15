package com.designpattern.designpattern.factory.abstracts.bcaklikpay;

import com.designpattern.designpattern.factory.abstracts.EPaymentMethod;
import com.designpattern.designpattern.factory.abstracts.ICancelPaymentRequest;

public class BcaKlikPayCancelPaymentRequest implements ICancelPaymentRequest {

    private String id;
    private Long amount;
    private Long fee;

    @Override
    public String getId() {
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }

    @Override
    public void setId(String id) {
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    }

    @Override
    public EPaymentMethod getMethod() {
        return EPaymentMethod.BCA_KLIKPAY;
    }
}
