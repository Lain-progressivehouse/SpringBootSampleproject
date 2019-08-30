package com.example.sampleproject.login.domain.model;

import java.util.Date;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

/**
 * SignupForm
 */
@Data
public class SignupForm {

    /**
     * ユーザーID 入力必須、メールアドレス形式
     */
    @NotBlank // 入力必須
    @Email // メールアドレス形式
    private String userId;

    /**
     * パスワード 入力必須、長さ4から100まで、半角英数字のみ
     */
    @NotBlank
    @Length(min = 4, max = 100)
    @Pattern(regexp = "^[a-zA-Z0-9]+$")
    private String password;

    /**
     * ユーザー名 入力必須
     */
    @NotBlank
    private String userName;

    /**
     * 誕生日 入力必須、yyyy/MM/dd形式
     */
    @NotNull
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date birthday;

    /**
     * 年齢 値が20から100まで
     */
    @Min(20)
    @Max(100)
    private int age;

    /**
     * 結婚ステータス Falseのみ可能
     */
    @AssertFalse
    private boolean marriage;

}