package com.xx.hm.controller;

import com.xx.hm.dao.UserDao;
import com.xx.hm.model.User;
import com.xx.hm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User: xx
 * Date: 2014/12/29
 * Time: 16:57
 */
@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("index")
    public String index(){
        System.out.println("fuck me");
        User user = new User();
        user.setNickname("你好");
        user.setState(2);
//        userService.insertUser(user);
        System.out.println(userService.insertUser(user));
        System.out.println("fuck me again");
        return "index";
    }

    /*public void setUserService(UserService userService) {
        this.userService = userService;
    }*/

    @RequestMapping("writeTestHtml")
    public String writeTestHtml(){
        try {
            userService.writeTestHtml();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "index";
    }
}
