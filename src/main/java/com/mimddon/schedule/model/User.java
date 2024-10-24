package com.mimddon.schedule.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private Integer id;

    private String email;
    private String password;
    private String name;
    private String phoneNumber;

}
