package com.example.relationship.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.aspectj.weaver.ast.Or;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "User_table")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String email;
    private String password;
    private String confirmPassword;
    private String userName;
    private String firstName;
    private String lastname;
    private String surName;
    private String phone;
    private int userRole = 1;
    private boolean gender;
    private LocalDateTime DOB;


    private boolean isDeleted;
    private LocalDateTime createAt = LocalDateTime.now();
    private LocalDateTime updateAt = LocalDateTime.now();
    private LocalDateTime lastActive = LocalDateTime.now();


    @OneToOne(mappedBy = "user")
    private Address address;

    @OneToMany(mappedBy = "user")
    private List<Order> orderList = new ArrayList<>();

//    public User(String email, String password, String confirmPassword, String userName, String firstName, String lastname, String surName, String phone, int userRole, boolean gender, LocalDateTime DOB, Address address) {
//        this.email = email;
//        this.password = password;
//        this.confirmPassword = confirmPassword;
//        this.userName = userName;
//        this.firstName = firstName;
//        this.lastname = lastname;
//        this.surName = surName;
//        this.phone = phone;
//        this.userRole = userRole;
//        this.gender = gender;
//        this.DOB = DOB;
//        this.address = address;
//    }

    public User(String email, String password, String confirmPassword, String userName, String firstName, String lastname, String surName, String phone, boolean gender, LocalDateTime DOB) {
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.userName = userName;
        this.firstName = firstName;
        this.lastname = lastname;
        this.surName = surName;
        this.phone = phone;
        this.gender = gender;
        this.DOB = DOB;
    }

}
