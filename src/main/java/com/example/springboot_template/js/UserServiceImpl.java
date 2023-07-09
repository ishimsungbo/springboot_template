package com.example.springboot_template.js;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("userService") //어노테이션에 이름을 주면 컨트롤러 주입시 이름을 Resources("") 넣어야 함...안주면 자동지정
public class UserServiceImpl implements UserService{
    @Override
    public List<User> userList() {

        List<User> userList = new ArrayList<>();
        for(int i=0;i<10;i++){
            userList.add(new User("uid"+i,"uName"+i,i));
        }
        return userList;
    }
}
