package com.sfl.repository.user.chatuser;

import com.sfl.entity.user.chatuser.ChatUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by User on 05.02.2018.
 */
@Repository
public interface ChatUserRepository extends JpaRepository<ChatUser, Long> {

    ChatUser findByUsername(String username);

}
