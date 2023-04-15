package com.designpattern.designpattern.factory.abstracts;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = AbstractFactory.class)
public class AbstractFactoryTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testAbstractFactory() {
        IPaymentFactory paymentFactoryCreditcard = applicationContext.getBean(CreditcardPaymentFactory.class);
        IPaymentFactory paymentFactoryBcaKlikPay = applicationContext.getBean(BcaKlikPayPaymentFactory.class);
        IPaymentFactory paymentFactoryGopay = applicationContext.getBean(GopayPaymentFactory.class);

        charge(paymentFactoryBcaKlikPay);
        charge(paymentFactoryCreditcard);
        charge(paymentFactoryGopay);
    }

    public void charge(IPaymentFactory paymentFactory) {
        IChargePaymentRequest request = paymentFactory.createChargePaymentRequest();
        request.setAmount(1000000L);
        request.setId("xxx");

        // kirim ke payment gateway
        System.out.println(request);
    }

    public void cancel(IPaymentFactory paymentFactory) {
        ICancelPaymentRequest request = paymentFactory.createCancelPaymentRequest();
        request.setId("xxx");

        // kirim ke payment gateway
        System.out.println(request);
    }

    public Long getBalance(IPaymentFactory paymentFactory) {
        try {
            IGetBalancePaymentRequest request = paymentFactory.createGetBalancePaymentRequest();
            request.setUserId("xxxnauval");

            // send to payment gateway
            return 1000000L;
        } catch (Exception e) {
            return 0L;
        }
    }

}
