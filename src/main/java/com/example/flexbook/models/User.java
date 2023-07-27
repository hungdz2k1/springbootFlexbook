package com.example.flexbook.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userID;
    @Column(name = "user_name")
    private String username;
    @Column(name = "email" , nullable = false,length = 100,unique = true)
    private String email;
    @Column(name = "password", nullable = false,length = 255)
}
