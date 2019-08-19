package com.app.rc.gettingStartedWithSpringBootMicroservice.ui.model.response;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UsersResponseModel {
    private int id;
    private String username;
    private String accessKey;
}