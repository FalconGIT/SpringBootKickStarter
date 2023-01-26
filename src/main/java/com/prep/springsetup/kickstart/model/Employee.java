package com.prep.springsetup.kickstart.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="EMPLOYEES")
public class Employee {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 31)
    private String name;
    @Column(nullable = false, length = 31)
    private String email;

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
