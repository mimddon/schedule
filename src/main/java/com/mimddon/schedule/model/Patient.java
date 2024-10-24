package com.mimddon.schedule.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
public class Patient {
    //필수 필드
    private Integer id;
    private String patientName; // 이름
    private String phoneNumber; // 환자 전화 번호
    private String supportType; // 환자 지원 종류
    private String hospitalId; // 병원 id
    private String hospitalName; // 병원 이름

    // 선택 필드
    private Integer managerId;     // 담당자 id
    private String managerName;    // 담당자 이름 (담당자 미 배정 시 "담당자 미배정"으로 처리)

    private LocalDate birth; // 환자 생년월일
    private String guardianPhoneNumber; // 보호자 전화 번호
    private Double supportAmount;  // 지원 금액
    private String diseaseName;    // 환자 병명
    private Integer totalSessions; // 총 치료 횟수
    private Integer currentSessions; // 현재 치료 횟수
    private Integer remainingSessions; // 남은 치료 횟수
    private String attentionLevel; // 주의 등급
    private String memo; // 메모
    private LocalDateTime registrationDate; // 등록일
}
