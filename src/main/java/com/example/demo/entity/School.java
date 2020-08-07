package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "school")
@Data
public class School {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "rank")
    private Integer rank;
    @Column(name = "belong985")
    private boolean belong985;
    @Column(name = "belong211")
    private boolean belong211;
}
