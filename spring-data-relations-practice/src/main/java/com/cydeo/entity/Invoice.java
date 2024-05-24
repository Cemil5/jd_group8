package com.cydeo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Invoice extends BaseEntity{

    private String invoiceNumber;
    private String invoiceType;

    private LocalDate invoiceDate;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;


}
