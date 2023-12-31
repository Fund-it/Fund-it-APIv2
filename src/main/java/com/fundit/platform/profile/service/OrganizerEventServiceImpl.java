package com.fundit.platform.profile.service;

import com.fundit.platform.profile.domain.model.OrganizerEvent;
import com.fundit.platform.profile.domain.persistence.OrganizerEventRepository;
import com.fundit.platform.profile.domain.persistence.OrganizerRepository;
import com.fundit.platform.profile.domain.service.OrganizerEventService;
import com.fundit.platform.shared.exception.ResourceValidationException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizerEventServiceImpl implements OrganizerEventService {

    private final OrganizerEventRepository organizerEventRepository;

    private final OrganizerRepository organizerRepository;

    public OrganizerEventServiceImpl(OrganizerEventRepository organizerEventRepository, OrganizerRepository organizerRepository) {
        this.organizerEventRepository = organizerEventRepository;
        this.organizerRepository = organizerRepository;
    }

    @Override
    public List<OrganizerEvent> getAll() {
        return organizerEventRepository.findAll();
    }

    @Override
    public List<OrganizerEvent> getAllByOrganizerId(Long organizerId) {
        var organizer=organizerRepository.findById(organizerId);
        if(organizer==null) throw new ResourceValidationException("The organizer doesn't exist.");
        return organizerEventRepository.findAllByOrganizerId(organizerId);
    }
}
