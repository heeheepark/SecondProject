package com.green.secondproject.myPage.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class SelStudentMyPageVo {
    private int userId;
    private String stdnm;
    private String email;
    private String pic;
    private LocalDate birth;
    private String phone;
    private String Address;
    private int classId;
    private String grade;
    private String van;
    private int schoolId;
    private String snm;
}
