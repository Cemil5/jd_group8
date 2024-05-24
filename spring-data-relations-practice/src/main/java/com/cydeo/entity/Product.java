package com.cydeo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
@Getter
@Setter
public class Product extends BaseEntity {

    private String name;
    private double price;


    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


}
