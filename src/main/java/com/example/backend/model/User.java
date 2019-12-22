package com.example.backend.model;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;


@Data
@Entity

@EntityListeners(AuditingEntityListener.class)
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_address")
    private String email;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

}
