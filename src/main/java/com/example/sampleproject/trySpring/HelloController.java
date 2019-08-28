package com.example.sampleproject.tryspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String Hello() {
        return "hello";
    }

    @PostMapping("/hello")
    public String PostRequest(@RequestParam("text1")String str, Model model) {
        // attributeにkeyとvalueを登録
        model.addAttribute("sample", str);
        return "helloResponse";
    }

    @PostMapping("/hello/db")
    public String postDbRequest(@RequestParam("text2")String str, Model model) {

        // String型からint型に変換
        int id = Integer.parseInt(str);

        // 1件検索
        Employee employee = helloService.findOne(id);

        // 検索結果をModelに登録
        model.addAttribute("id", employee.getEmployeeId());
        model.addAttribute("name", employee.getEmployeeName());
        model.addAttribute("age", employee.getAge());

        // helloResponseDB.htmlに遷移
        return "helloResponseDB";
    }

}