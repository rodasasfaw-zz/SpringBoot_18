package com.example.demo;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public class SecurityConfiguration {
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http
                .authorizeRequests()
                .antMatchers("/", "/css/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .and()
                .httpBasic();
    }

}
