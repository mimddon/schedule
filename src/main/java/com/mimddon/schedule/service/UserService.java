package com.mimddon.schedule.service;

import com.mimddon.schedule.model.Login;
import com.mimddon.schedule.model.Signup;

public interface UserService {
    void login(Login login);

    void signUp(Signup user);

    boolean isEmailExists(String email);
}
