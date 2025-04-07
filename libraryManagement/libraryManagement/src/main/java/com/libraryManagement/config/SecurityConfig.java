package com.libraryManagement.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(requests ->
                        requests
                                .requestMatchers("/").permitAll()  // Allow access to /register without authentication
                                .anyRequest().authenticated()  // Require authentication for all other requests
                )
                .csrf(csrf -> csrf.disable());  // Disable CSRF for simplicity (not recommended for production)
        return http.build();
    }
}