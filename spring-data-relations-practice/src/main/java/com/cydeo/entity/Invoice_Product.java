package com.cydeo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class Invoice_Product extends BaseEntity{

    private int quantity;
    private double profit;


    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;


    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;


}
