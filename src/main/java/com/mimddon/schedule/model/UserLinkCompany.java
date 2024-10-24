package com.mimddon.schedule.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class UserLinkCompany {
    private Integer userId; // 유저 ID
    private Integer companyId; // 회사 ID
    private String role; // 회사 내 역할 (예: 직원, 관리자, 고객 등)
    private LocalDate linkedDate; // 유저가 회사와 연결된 날짜
}
