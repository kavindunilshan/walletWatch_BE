package com.example.walletWatch.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @Getter @Setter
    @Column
    private int userId;

    @Getter @Setter
    @Column
    private String first_name;

    @Getter @Setter
    @Column
    private String last_name;

    @Getter @Setter
    @Column
    private String email;
}
