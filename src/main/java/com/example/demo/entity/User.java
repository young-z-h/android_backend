package com.example.demo.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "username")
    private String username;
//    @Autowired
    @Column(name = "password")
    private String password;
//    @Column(name = "school")
    @JoinColumn(name = "school", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL)
    private School school;
    @JoinColumn(name = "major", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL)
    private Major major;
    @Column(name = "target_region")
    private Integer target_region;
    @Column(name = "GPA")
    private Double gpa;
    @Column(name = "IELTS")
    private Double ielts;
    @Column(name = "TOEFL")
    private Integer toefl;
    @Column(name = "college_entrance_examination_fraction")
    private Integer college_entrance_examination_fraction;
    @Column(name = "TEF")
    private Integer tef;
//    @Column(name = "testDafLevel")
//    private String testDaf;
}
