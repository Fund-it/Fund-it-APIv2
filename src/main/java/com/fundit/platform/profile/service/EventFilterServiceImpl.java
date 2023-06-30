package com.fundit.platform.profile.service;

import com.fundit.platform.booking.api.internal.BookingContextFacade;
import com.fundit.platform.profile.domain.service.EventFilterService;

public class EventFilterServiceImpl implements EventFilterService {
    private final BookingContextFacade bookingContextFacade;

    public EventFilterServiceImpl(BookingContextFacade bookingContextFacade) {
        this.bookingContextFacade = bookingContextFacade;
    }


/*    @Override
    public List<Event> getAllEventsByOrganizer(Long id) {
        return bookingContextFacade.getAllByOrganizerId(id);
    }*/
}
