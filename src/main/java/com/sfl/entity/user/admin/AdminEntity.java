package com.sfl.entity.user.admin;

import com.sfl.entity.user.UserEntity;
import com.sfl.entity.user.UserType;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by User on 05.02.2018.
 */
@Entity
@Table(name = "admin_user")
@DiscriminatorValue(value = "ADMIN")
public class AdminEntity extends UserEntity {

    public AdminEntity() {
        setUserType(UserType.ADMIN);
    }
}
