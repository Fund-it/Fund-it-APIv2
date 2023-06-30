package com.fundit.platform.security.domain.service.communication;

import com.fundit.platform.security.resource.UserResource;
import com.fundit.platform.shared.domain.service.communication.BaseResponse;

public class RegisterResponse extends BaseResponse<UserResource> {
    public RegisterResponse(String message) {
        super(message);
    }

    public RegisterResponse(UserResource resource) {
        super(resource);
    }
}
