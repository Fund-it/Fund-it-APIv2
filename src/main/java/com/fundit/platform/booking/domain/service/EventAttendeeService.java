package com.fundit.platform.booking.domain.service;

import com.fundit.platform.booking.domain.model.EventAttendee;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EventAttendeeService {

    List<EventAttendee> getAll();

    //EventAttendee getById(Long eventAttendeeId);

    EventAttendee create(EventAttendee eventAttendee);

    ResponseEntity<?> delete(Long eventAttendeeId);

    List<EventAttendee> getAllByAttendeeId(Long attendeeId);

    List<EventAttendee> getAllAttendeesByEventId(Long eventId);




}
