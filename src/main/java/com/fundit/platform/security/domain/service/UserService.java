package com.fundit.platform.security.domain.service;

import com.fundit.platform.security.domain.model.entity.User;
import com.fundit.platform.security.domain.service.communication.AuthenticateRequest;
import com.fundit.platform.security.domain.service.communication.RegisterRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    ResponseEntity<?> authentication(AuthenticateRequest request);
    ResponseEntity<?>  register(RegisterRequest request);
    List<User> getAll();
}
