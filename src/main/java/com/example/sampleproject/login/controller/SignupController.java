package com.example.sampleproject.login.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import com.example.sampleproject.login.domain.model.SignupForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * SignupController ユーザー登録画面
 */
@Controller
public class SignupController {

    /**
     * ラジオボタン
     */
    private Map<String, String> radioMarriage;

    /**
     * ラジオボタンの初期化メソッド
     * 
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
     * 
     * @param form
     * @param model
     * @return signup.htmlに遷移
     */
    @GetMapping("/signup")
    public String getSignUp(@ModelAttribute SignupForm form, Model model) {
        // ラジオボタンの初期化
        radioMarriage = initRadioMarriage();

        // ラジオボタン用のMapをModelに登録
        model.addAttribute("radioMarriage", radioMarriage);

        // signup.html画面に遷移
        return "login/signup";
    }

    /**
     * ユーザー登録画面のPOST用のコントローラー
     * 
     * @param form
     * @param bindResult
     * @param model
     * @return login.htmlに遷移
     */
    @PostMapping("/signup")
    public String postSignU(@ModelAttribute SignupForm form, BindingResult bindingResult, Model model) {
        // 入力チェックに引っかかった場合、ユーザー登録画面に戻る
        if (bindingResult.hasErrors()) {
            return getSignUp(form, model);
        }

        System.out.println(form);

        // login.htmlにリダイレクト
        return "redirect:/login";
    }

}