package com.fundit.platform.profile.api.internal;

import com.fundit.platform.profile.domain.model.Organizer;

import java.util.List;

public interface ProfileContextFacade {

    List<Organizer> getAllOrganizers();
}
