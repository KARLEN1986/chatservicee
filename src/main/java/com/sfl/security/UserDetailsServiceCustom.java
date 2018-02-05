package com.sfl.security;

import com.sfl.entity.user.admin.AdminEntity;
import com.sfl.entity.user.chatuser.ChatUser;
import com.sfl.service.admin.AdminUserService;
import com.sfl.service.chatuser.ChatuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by User on 05.02.2018.
 */
@Service
public class UserDetailsServiceCustom implements UserDetailsService {

    @Autowired
    private AdminUserService adminUserService;

    @Autowired
    private ChatuserService chatuserService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        final AdminEntity adminEntity = adminUserService.findByUsername(s);

        // no admin
        if (adminEntity == null) {

            final ChatUser chatUser = chatuserService.findByUsername(s);

            if (chatUser == null) {
                throw new UsernameNotFoundException("User details not found with this username: " + s);
            }

            return new CustomChatUserDetails(chatUser);
        }

        return new CustomAdminUserDetails(adminEntity);
    }
}
