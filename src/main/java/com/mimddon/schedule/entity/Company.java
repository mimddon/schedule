package com.mimddon.schedule.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Entity
@Builder
@Table(name = "company")
@NoArgsConstructor // JPA에서 기본 생성자 필요
@AllArgsConstructor // 모든 필드를 포함하는 생성자
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    private String address;

    @Column(name = "contact_number", nullable = true)
    private String contactNumber;
}
