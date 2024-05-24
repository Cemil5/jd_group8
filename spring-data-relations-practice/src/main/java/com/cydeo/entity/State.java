package com.cydeo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class State extends BaseEntity {

    private String stateCode;
    private String stateName;
}
