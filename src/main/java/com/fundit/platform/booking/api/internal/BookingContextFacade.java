package com.fundit.platform.booking.api.internal;

import com.fundit.platform.booking.domain.model.Event;

import java.util.List;

public interface BookingContextFacade {

   List<Event> getAllEvents();
   //List<Event> getAllByOrganizerId(Long id);

}
