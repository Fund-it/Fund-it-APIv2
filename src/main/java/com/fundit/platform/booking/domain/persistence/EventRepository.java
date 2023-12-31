package com.fundit.platform.booking.domain.persistence;


import com.fundit.platform.booking.domain.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    Event findByName(String name);
    //List<Event> findAllByOrganizerId(Long id);
}
