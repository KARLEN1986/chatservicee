package com.sfl.entity.user.chatuser;

import com.sfl.entity.user.UserEntity;
import com.sfl.entity.user.UserType;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by User on 05.02.2018.
 */
@Entity
@Table(name = "chat_user")
@DiscriminatorValue(value = "CHAT_USER")
public class ChatUser extends UserEntity {

    public ChatUser() {
        setUserType(UserType.CHAT_USER);
    }
}
