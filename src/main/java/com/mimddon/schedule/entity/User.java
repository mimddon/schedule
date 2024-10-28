package com.mimddon.schedule.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@NoArgsConstructor      // JPA에서 엔티티를 사용하기 위해 기본 생성자 필요
@AllArgsConstructor       // 모든 필드 생성자 추가
@Builder
@Getter
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 자동 생성되는 기본 키
    private Long id;

    @Column(nullable = false, unique = true)  // 이메일은 필수이며, 고유하게 설정
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    private String phoneNumber;

}
