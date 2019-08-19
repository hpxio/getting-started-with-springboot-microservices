package com.app.rc.gettingStartedWithSpringBootMicroservice.shared.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UsersDTO {
    private int id;
    private String username;
    private String password;
    private String accessKey;
    private boolean status;
}