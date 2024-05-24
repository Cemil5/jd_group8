package com.cydeo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User extends BaseEntity{

    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    private String password;
    private String email;


    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;



}
