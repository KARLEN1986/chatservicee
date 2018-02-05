package com.sfl.repository.user.admin;

import com.sfl.entity.user.admin.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by User on 05.02.2018.
 */
@Repository
public interface AdminUserRepository extends JpaRepository<AdminEntity, Long> {

    AdminEntity findByUsername(String username);

}
