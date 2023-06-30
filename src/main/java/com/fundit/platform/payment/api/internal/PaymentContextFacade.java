package com.fundit.platform.payment.api.internal;

import com.fundit.platform.payment.domain.model.Payment;

import java.util.List;

public interface PaymentContextFacade {
    List<Payment> getAllPayments();
    
}
