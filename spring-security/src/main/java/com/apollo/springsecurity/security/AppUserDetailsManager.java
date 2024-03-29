package com.apollo.springsecurity.security;

import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class AppUserDetailsManager implements UserDetailsManager {

    private List<UserDetails> users = new ArrayList<>();

    @Override
    public void createUser(UserDetails user) {
        users.add(user);
    }

    @Override
    public void updateUser(UserDetails user) { }

    @Override
    public void deleteUser(String username) { }

    @Override
    public void changePassword(String oldPassword, String newPassword) { }

    @Override
    public boolean userExists(String username) {
        return users.stream()
                .anyMatch((user) -> user.getUsername().equals(username));
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return users.stream()
                .filter((user) -> user.getUsername().equals(username))
                .findFirst()
                .orElseThrow(() -> new UsernameNotFoundException(":("));
    }

}
