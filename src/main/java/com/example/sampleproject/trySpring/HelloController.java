package com.example.sampleproject.tryspring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String Hello() {
        return "hello";
    }

    @PostMapping("hello")
    public String PostRequest(@RequestParam("text1")String str, Model model) {
        // attributeにkeyとvalueを登録
        model.addAttribute("sample", str);
        return "helloResponse";
    }
}