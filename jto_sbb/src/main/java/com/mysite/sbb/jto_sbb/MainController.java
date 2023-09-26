package com.mysite.sbb.jto_sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/sbb")
    @ResponseBody//url 요청 대한 응답으로 문자열 응답
    public String index(){
        //'/sbb'URL과 매핑
        return "안녕하세요 sbb에 오신것을 환영합니다";
    }
}
