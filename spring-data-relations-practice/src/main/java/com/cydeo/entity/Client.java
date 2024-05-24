package com.cydeo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class Client extends BaseEntity {

    private String clientName;
    private String phone;
    private String email;

    @ManyToOne
    private Address address;


}
