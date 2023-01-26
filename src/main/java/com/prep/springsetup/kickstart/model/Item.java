package com.prep.springsetup.kickstart.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="ITEM")
public class Item {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String serialNumber;
    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    public Item(String serialNumber, Cart cart) {
        this.serialNumber = serialNumber;
        this.cart = cart;
    }
}
