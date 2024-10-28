package com.mimddon.schedule.service;

import com.mimddon.schedule.entity.User;
import com.mimddon.schedule.model.Login;
import com.mimddon.schedule.model.Signup;
import com.mimddon.schedule.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final PasswordEncoder passwordEncoder;

    private final UserRepository userRepository;

    @Override
    public void login(Login login) {

        User user = userRepository.findByEmail(login.getEmail())
                .orElseThrow(() -> new RuntimeException("User not found"));

        boolean passwordMatch = passwordEncoder.matches(login.getPassword(), user.getPassword());

        if (!passwordMatch) {
            throw new RuntimeException("Invalid password");
        }

        // 3. 로그인 성공 처리
    }

    @Override
    public void signUp(Signup request) {
        // 이메일 중복 확인
        if (userRepository.existsByEmail(request.getEmail())) {
            throw new RuntimeException("Email already in use");
        }

        // 1. 비밀번호 암호화
        String encodedPassword = passwordEncoder.encode(request.getPassword());

        // 2. User 엔티티 생성 및 저장
        User user = User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(encodedPassword) // 암호화된 비밀번호 저장
                .phoneNumber(request.getPhoneNumber())
                .build();

        userRepository.save(user);  // DB에 사용자 저장

    }

    @Override
    public boolean isEmailExists(String email) {
        return false;
        //return userRepository.existsByEmail(email);
    }
}
