package com.sfl.service.chatuser;

import com.sfl.entity.user.chatuser.ChatUser;
import com.sfl.repository.user.chatuser.ChatUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by User on 05.02.2018.
 */
@Service
public class ChatuserService {

    @Autowired
    private ChatUserRepository chatUserRepository;


    public ChatUser findByUsername(String s) {
        return chatUserRepository.findByUsername(s);
    }
}
