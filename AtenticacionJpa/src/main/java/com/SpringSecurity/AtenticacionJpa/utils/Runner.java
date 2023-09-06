package com.SpringSecurity.AtenticacionJpa.utils;

import com.SpringSecurity.AtenticacionJpa.model.Authority;
import com.SpringSecurity.AtenticacionJpa.model.User;
import com.SpringSecurity.AtenticacionJpa.repositories.AuthorityRepository;
import com.SpringSecurity.AtenticacionJpa.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Runner implements CommandLineRunner {

    private final UserRepository userRepository;

    private final AuthorityRepository authorityRepository;


    public Runner(UserRepository userRepository, AuthorityRepository authorityRepository){
        this.userRepository = userRepository;
        this.authorityRepository= authorityRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        if (this.authorityRepository.count() == 0){
            this.authorityRepository.saveAll(List.of(
                    new Authority(AuthorityName.ADMIN),
                    new Authority(AuthorityName.READ),
                    new Authority(AuthorityName.WRITE)
            ));
        }
        if (this.userRepository.count() == 0){
            this.userRepository.saveAll(List.of(
                   new User("sebastian","sebas123",List.of(this.authorityRepository.findByName(AuthorityName.READ).get())),
                   new User("mateo","mateo123",List.of(this.authorityRepository.findByName(AuthorityName.WRITE).get())),
                   new User("juan","juan123",List.of(this.authorityRepository.findByName(AuthorityName.ADMIN).get()))

                 )
            );
        }


    }
}
