package com.controller;

import com.entity.User;
import com.service.UserService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName UserController
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/17
 * @Version V1.0
 **/
@Controller
@RequestMapping("/project/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    @ResponseBody
    public String login(User user){
        System.out.println("user login");
        User user1 = userService.login(user);
        JSONObject jsonObject = new JSONObject();
        String result = jsonObject.fromObject(user1).toString();
        return result;
    }
}
