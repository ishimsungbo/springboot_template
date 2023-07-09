package com.example.springboot_template.js;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
public class UserController {

    //@Autowired 자동
    //@Resource(name="userService") 명시?

    @Resource(name="userService")
    private UserService userService;

    @RequestMapping("/user/userlist")
    public List<User> userList(){
        return userService.userList();
    }

    @RequestMapping("/user/info")
    public String info(){
        return "임의의 정보";
    }
}
