package com.fundit.platform.profile.domain.service;

import com.fundit.platform.profile.domain.model.OrganizerEvent;

import java.util.List;

public interface OrganizerEventService {

    List<OrganizerEvent> getAll();
    List<OrganizerEvent> getAllByOrganizerId(Long organizerId);
}
