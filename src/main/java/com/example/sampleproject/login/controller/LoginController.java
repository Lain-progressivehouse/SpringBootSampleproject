package com.example.sampleproject.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * ログイン画面
 */
@Controller
public class LoginController {

    /**
     * ログイン画面のGET用コントローラー
     * 
     * @param model
     * @return login.htmlに遷移
     */
    @GetMapping("/login")
    public String getLogin(Model model) {
        return "login/login";
    }

    /**
     * ログイン画面のPOST用コントローラー
     * 
     * @param model
     * @return login.htmlに遷移
     */
    @PostMapping("/login")
    public String postLogin(Model model) {
        return "/login/login";
    }

}