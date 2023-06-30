package com.fundit.platform.booking.domain.persistence;

import com.fundit.platform.booking.domain.model.Event;
import com.fundit.platform.booking.domain.model.EventPayment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EventPaymentRepository extends JpaRepository<EventPayment,Long> {

    List<EventPayment> findAllByEvent(Optional<Event> event);
}
