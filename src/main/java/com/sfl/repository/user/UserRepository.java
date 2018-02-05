package com.sfl.repository.user;

import com.sfl.entity.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by User on 05.02.2018.
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
