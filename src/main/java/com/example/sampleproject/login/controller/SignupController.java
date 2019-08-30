package com.example.sampleproject.login.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * SignupController
 * ユーザー登録画面
 */
@Controller
public class SignupController {

    /**
     * ラジオボタン
     */
    private Map<String, String> radioMarriage;

    /**
     * ラジオボタンの初期化メソッド
     * @return ラジオボタン
     */
    private Map<String, String> initRadioMarriage() {
        Map<String, String> radio = new LinkedHashMap<>();

        radio.put("既婚", "true");
        radio.put("未婚", "false");
        
        return radio;
    }

    /**
     * ユーザー登録画面のGET用コントローラー
     * @param model
     * @return signup.htmlに遷移
     */
    @GetMapping("/signup")
    public String getSignUp(Model model) {
        // ラジオボタンの初期化
        radioMarriage = initRadioMarriage();

        // ラジオボタン用のMapをModelに登録
        model.addAttribute("radioMarriage", radioMarriage);

        // signup.html画面に遷移
        return "login/signup";
    }

    /**
     * ユーザー登録画面のPOST用のコントローラー
     * @param model
     * @return login.htmlに遷移
     */
    @PostMapping("/signup")
    public String postSignU(Model model) {
        // login.htmlにリダイレクト
        return "redirect:/login";
    }
    
}