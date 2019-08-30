package com.example.sampleproject.login.domain.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

/**
 * SignupForm
 */
@Data
public class SignupForm {

    /**
     * ユーザーID
     */
    private String userId;

    /**
     * パスワード
     */
    private String password;

    /**
     * ユーザー名
     */
    private String userName;

    /**
     * 誕生日
     */
    @DateTimeFormat
    private Date birthday;

    /**
     * 年齢
     */
    private int age;

    /**
     * 結婚ステータス
     */
    private boolean marriage;

}