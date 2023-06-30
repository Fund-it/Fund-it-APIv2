package com.fundit.platform.security.domain.service.communication;

import com.fundit.platform.security.resource.AuthenticateResource;
import com.fundit.platform.shared.domain.service.communication.BaseResponse;

public class AuthenticateResponse extends BaseResponse<AuthenticateResource> {

    public AuthenticateResponse(String message) {
        super(message);
    }

    public AuthenticateResponse(AuthenticateResource resource) {
        super(resource);
    }

}
