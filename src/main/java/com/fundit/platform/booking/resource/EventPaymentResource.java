package com.fundit.platform.booking.resource;

import lombok.*;

@Getter
@Setter
@With
@AllArgsConstructor
@NoArgsConstructor
public class EventPaymentResource {

    private Long paymentId;
    private Long Event;
}
