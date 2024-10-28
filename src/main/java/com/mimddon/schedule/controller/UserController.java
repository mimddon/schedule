package com.mimddon.schedule.controller;

import com.mimddon.schedule.model.Login;
import com.mimddon.schedule.model.Signup;
import com.mimddon.schedule.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/guest/check-email")
    public ResponseEntity<Boolean> checkEmail(@RequestParam String email) {
        boolean isEmailExists = userService.isEmailExists(email);
        return ResponseEntity.ok(isEmailExists);  // true: 이메일 중복, false: 사용 가능
    }

    @GetMapping("/guest/signup")
    public String showSignupPage() {
        return "signup";
    }

    @PostMapping("/guest/sign-up")
    public ResponseEntity<String> signUp(Signup user) {
        userService.signUp(user);
        return ResponseEntity.ok("Sign up successful");
    }

    @GetMapping("/guest/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/guest/login")
    public ResponseEntity<String> signIn(Login login) {
        userService.login(login);
        return ResponseEntity.ok("Sign in successful");
    }


}
