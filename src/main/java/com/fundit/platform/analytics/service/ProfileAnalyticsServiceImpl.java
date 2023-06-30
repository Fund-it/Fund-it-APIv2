package com.fundit.platform.analytics.service;

import com.fundit.platform.analytics.domain.service.ProfileAnalyticsService;
import com.fundit.platform.profile.api.internal.ProfileContextFacade;
import org.springframework.stereotype.Service;

@Service
public class ProfileAnalyticsServiceImpl implements ProfileAnalyticsService {

    private final ProfileContextFacade profileContextFacade;

    public ProfileAnalyticsServiceImpl(ProfileContextFacade profileContextFacade) {
        this.profileContextFacade = profileContextFacade;
    }

    @Override
    public int getTotalOrganizers() {
        return profileContextFacade.getAllOrganizers().size();
    }

}
