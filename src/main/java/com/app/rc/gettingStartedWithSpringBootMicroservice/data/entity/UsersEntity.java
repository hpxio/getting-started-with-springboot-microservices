package com.app.rc.gettingStartedWithSpringBootMicroservice.data.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity(name = "gsw_sbms_users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UsersEntity {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Column(unique = true)
    private String username;

    @NotNull
    private String password;

    @NotNull
    @Column(unique = true)
    private String accessKey;

    private boolean status;
}