package com.fundit.platform.booking.domain.service;

import com.fundit.platform.booking.domain.model.EventPayment;

import java.util.List;

public interface EventPaymentService {

    List<EventPayment> getAll();

    List<EventPayment> getAllPaymentByEventId(Long eventId);

}
