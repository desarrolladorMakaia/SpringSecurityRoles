package com.SpringSecurity.AtenticacionJpa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class WebSecurityConfig {

//    @Bean
//    public UserDetailsService userDetailsService(){
//         var user = User.withUsername("sebastian")
//                 .password("12345")
//                 .roles("read")
//                 .build();
//
//         return new InMemoryUserDetailsManager(user);
//
//    }



 @Bean
 public PasswordEncoder passwordEncoder(){
     return PasswordEncoderFactories.createDelegatingPasswordEncoder();

 }





}
