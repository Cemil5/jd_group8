package com.cydeo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class Address extends BaseEntity{

    private String description;
    private String zipCode;

    @ManyToOne
    private State state;
}
