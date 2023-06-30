package com.fundit.platform.security.domain.service;

import com.fundit.platform.security.domain.model.entity.Role;

import java.util.List;

public interface RoleService {

    void seed();
    List<Role> getAll();

}
