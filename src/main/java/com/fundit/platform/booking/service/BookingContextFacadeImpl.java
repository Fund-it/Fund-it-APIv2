package com.fundit.platform.booking.service;

import com.fundit.platform.booking.api.internal.BookingContextFacade;
import com.fundit.platform.booking.domain.model.Event;
import com.fundit.platform.booking.domain.service.EventService;

import java.util.List;

public class BookingContextFacadeImpl implements BookingContextFacade {
    private final EventService eventService;

    public BookingContextFacadeImpl(EventService eventService) {
        this.eventService = eventService;
    }

    @Override
    public List<Event> getAllEvents() {
        return eventService.getAll();
    }

/*    @Override
    public List<Event> getAllByOrganizerId(Long id) {
        return eventService.getAllByOrganizerId(id);
    }*/
}
