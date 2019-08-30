package com.example.sampleproject.login.domain.model;

import java.util.Date;

import lombok.Data;

/**
 * User
 */
@Data
public class User {

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
    private Date birthday;

    /**
     * 年齢
     */
    private int age;

    /**
     * 結婚ステータス
     */
    private boolean marriage;

    /**
     * ロール
     */
    private String role;

}