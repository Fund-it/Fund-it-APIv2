package com.fundit.platform.booking.domain.persistence;

import com.fundit.platform.booking.domain.model.Event;
import com.fundit.platform.booking.domain.model.EventAttendee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EventAttendeeRepository extends JpaRepository<EventAttendee, Long> {

    Optional<EventAttendee> findByEventId(Long id);

    List<EventAttendee> findAllByAttendeeId(Long attendeeId);
    List<EventAttendee> findAllByEvent(Optional<Event> event);
}
