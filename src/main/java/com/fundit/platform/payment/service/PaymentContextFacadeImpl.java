package com.fundit.platform.payment.service;

import com.fundit.platform.payment.api.internal.PaymentContextFacade;
import com.fundit.platform.payment.domain.model.Payment;
import com.fundit.platform.payment.domain.service.PaymentService;

import java.util.List;

public class PaymentContextFacadeImpl implements PaymentContextFacade {

    private final PaymentService paymentService;

    public PaymentContextFacadeImpl(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public List<Payment> getAllPayments() {
        return paymentService.getAll();
    }
}
