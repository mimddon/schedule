package com.mimddon.schedule.controller;

import com.mimddon.schedule.model.SignIn;
import com.mimddon.schedule.model.User;
import com.mimddon.schedule.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/user/users")
    public String users() {
        return null;
    }

    @GetMapping("/companies")
    public String companies() {
        return null;
    }

    @GetMapping("/guest/signup")
    public String showSignupPage() {
        return "signup";
    }

    @PostMapping("/guest/sign-up")
    public ResponseEntity<String> signUp(User user) {
        userService.signUp(user);
        return ResponseEntity.ok("Sign up successful");
    }

    @GetMapping("/guest/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/guest/login")
    public ResponseEntity<String> signIn(SignIn signIn) {
        userService.signIn(signIn);
        return ResponseEntity.ok("Sign in successful");
    }


}
