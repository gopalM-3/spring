package com.apollo.springsecurity.config;

import com.apollo.springsecurity.security.AppUserDetailsManager;
import com.apollo.springsecurity.security.PlainTextPasswordEncoder;
import com.apollo.springsecurity.security.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class ProjectConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((authz) -> authz
                        .anyRequest().authenticated()
                )
                .httpBasic(withDefaults());
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new PlainTextPasswordEncoder();
    }

    @Bean
    public UserDetailsManager userDetailsManager() {
        AppUserDetailsManager manager = new AppUserDetailsManager();
        manager.createUser(new User("apollo", "69"));

        return manager;
    }

}
