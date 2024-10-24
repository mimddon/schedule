package com.mimddon.schedule.controller;

import com.mimddon.schedule.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/api/users")
    public String users() {
        return null;
    }

    @GetMapping("/api/companys")
    public String companys() {
        return null;
    }


}
