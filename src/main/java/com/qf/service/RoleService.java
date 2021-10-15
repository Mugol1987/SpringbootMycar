package com.qf.service;

import java.util.List;

public interface RoleService {

    public List<String> findRoleByUserId(Long userId);
}
