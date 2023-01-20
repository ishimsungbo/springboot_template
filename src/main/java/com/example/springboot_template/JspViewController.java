package com.example.springboot_template;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspViewController {

    @GetMapping("/jsptest")
    public String jsptest(){
        System.out.println("==============================");
        return "jsptest";
    }

}
