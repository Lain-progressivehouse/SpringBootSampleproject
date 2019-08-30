package com.example.sampleproject.login.controller;

import com.example.sampleproject.login.domain.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * HomeController
 */
@Controller
public class HomeController {

    /**
     * ユーザーサービス
     */
    @Autowired
    UserService userService;

    /**
     * ユーザー一覧画面のGET用メソッド
     * 
     * @param model
     * @return homeLayout.htmlに遷移
     */
    @GetMapping("/home")
    public String getHome(Model model) {
        model.addAttribute("contents", "login/home :: home_contents");

        return "login/homeLayout";
    }

    /**
     * ログアウト用メソッド
     * 
     * @return login.htmlに遷移
     */
    @PostMapping("/logout")
    public String postLogout() {
        return "redirect:/login";
    }
}