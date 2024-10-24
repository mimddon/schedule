package com.mimddon.schedule.service;

import com.mimddon.schedule.model.SignIn;
import com.mimddon.schedule.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final PasswordEncoder passwordEncoder;

    @Override
    public void signIn(SignIn signIn) {
        User user = null;//userRepository.findByEmail(signIn.getEmail());

        if (user == null) {
            throw new RuntimeException("User not found");
        }

        boolean passwordMatch = passwordEncoder.matches(signIn.getPassword(), user.getPassword());

        if (!passwordMatch) {
            throw new RuntimeException("Invalid password");
        }

        // 3. 로그인 성공 처리
    }

    @Override
    public void signUp(User request) {
        String encodedPassword = passwordEncoder.encode(request.getPassword());
        User user = User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(encodedPassword) // BCrypt 처리
                .build();
        // 저장 로직

    }



}
