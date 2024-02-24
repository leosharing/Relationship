package com.example.relationship.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "Address_table")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String roadName;
    private String streetName;
    private String zipCode;
    private String other;

    @OneToOne
    private User user;

    public Address(String roadName, String streetName, String zipCode, String other, User user) {
        this.roadName = roadName;
        this.streetName = streetName;
        this.zipCode = zipCode;
        this.other = other;
        this.user = user;
    }

    public Address(String roadName, String streetName, String zipCode, String other) {
        this.roadName = roadName;
        this.streetName = streetName;
        this.zipCode = zipCode;
        this.other = other;
    }
}
