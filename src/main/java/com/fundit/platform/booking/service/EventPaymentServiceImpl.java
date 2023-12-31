package com.fundit.platform.booking.service;


import com.fundit.platform.booking.domain.model.EventPayment;
import com.fundit.platform.booking.domain.persistence.EventPaymentRepository;
import com.fundit.platform.booking.domain.persistence.EventRepository;
import com.fundit.platform.booking.domain.service.EventPaymentService;
import com.fundit.platform.shared.exception.ResourceValidationException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventPaymentServiceImpl implements EventPaymentService {


    private final EventPaymentRepository eventPaymentRepository;

    private final EventRepository eventRepository;

    public EventPaymentServiceImpl(EventPaymentRepository eventPaymentRepository, EventRepository eventRepository) {
        this.eventPaymentRepository = eventPaymentRepository;
        this.eventRepository = eventRepository;
    }


    @Override
    public List<EventPayment> getAll() {
        return eventPaymentRepository.findAll();
    }

    @Override
    public List<EventPayment> getAllPaymentByEventId(Long eventId) {

        var event=eventRepository.findById(eventId);
        if(event==null) throw new ResourceValidationException("The Event doesn't exist.");
        return eventPaymentRepository.findAllByEvent(event);
    }
}
