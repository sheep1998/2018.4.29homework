package com.example.sprintbootqi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.Collection;

public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService{
    @Autowired(required = true)
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final User cUser = userService.getByUsername(username);
        if(cUser == null){
            throw new UsernameNotFoundException(username+" cannot be found");
        }
        final Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("USER"));
        return new org.springframework.security.core.userdetails.User(cUser.getName(),cUser.getPassword(),authorities);
    }
}
