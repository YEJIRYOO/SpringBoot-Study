package com.mysite.sbb.jto_sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/sbb")
    public void index(){
        //'/sbb'URL과 매핑
        System.out.println("index");
    }
}
