package com.mysite.sbb.jto_sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //컨트롤러로 인식
public class HelloController {
    @GetMapping("/hello") //http://localhost:8080/hello url과 hello 메서드 매핑
    //GetMapping 과 PostMapping의 구분
    @ResponseBody //hello 메서드의 응답 결과가 문자열 그 자체임
    public String hello() {
        return "Hello World";
    }
}
