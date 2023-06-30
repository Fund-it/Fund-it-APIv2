package com.fundit.platform.booking.resource;

import com.fundit.platform.booking.domain.model.Event;
import lombok.*;

@Getter
@Setter
@With
@AllArgsConstructor
@NoArgsConstructor
public class EventAttendeeResource {

    private Long attendeeId;
    private Event event;
}
