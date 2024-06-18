package com.apple.bbmc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    @ResponseBody // 응답으로 문자열을 보낸다는뜻 , 이거 없으면 index.html을 찾아감
    public String index() {
        System.out.println("index");
        return "index";
    }
}
