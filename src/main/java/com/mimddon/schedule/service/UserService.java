package com.mimddon.schedule.service;

import com.mimddon.schedule.model.SignIn;
import com.mimddon.schedule.model.User;

public interface UserService {
    void signIn(SignIn signIn);

    void signUp(User user);
}
