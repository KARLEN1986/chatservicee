package com.sfl.service.admin;

import com.sfl.entity.user.admin.AdminEntity;
import com.sfl.repository.user.admin.AdminUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by User on 05.02.2018.
 */
@Service
public class AdminUserService {
    @Autowired
    private AdminUserRepository adminUserRepository;

    public AdminEntity findByUsername(final String username) {

        AdminEntity byUsername = adminUserRepository.findByUsername(username);

        return byUsername;
    }
}
