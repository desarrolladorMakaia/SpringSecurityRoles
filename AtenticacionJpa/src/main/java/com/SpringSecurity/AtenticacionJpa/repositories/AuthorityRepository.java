package com.SpringSecurity.AtenticacionJpa.repositories;

import com.SpringSecurity.AtenticacionJpa.model.Authority;
import com.SpringSecurity.AtenticacionJpa.utils.AuthorityName;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {

    Optional<Authority> findByName(AuthorityName name);
    //metodo para retornar un rol por su nombre
}
