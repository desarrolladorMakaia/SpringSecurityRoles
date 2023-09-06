package com.SpringSecurity.AtenticacionJpa.model;


import com.SpringSecurity.AtenticacionJpa.utils.AuthorityName;
import jakarta.persistence.*;

@Entity(name = "authorities")
public class Authority {

    public Authority(AuthorityName authorityName){
        this.name= authorityName;
    }

    public Authority() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AuthorityName getName() {
        return name;
    }

    public void setName(AuthorityName name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private AuthorityName name;


}
