package com.mimddon.schedule.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class User {
    private final String email;
    private final String password;
    private final String name;
    private final String phoneNumber;

}
