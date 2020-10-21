package com.pig1et.chapter.dubbo.consumer.controller;

import com.pig1et.chapter.dubbo.expose.user.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: pig1etO
 * @create: 2020-10-21 17:39
 **/
@RestController
public class UserController {

    @DubboReference
    private UserService userService;

    @GetMapping("/getUserInfoList")
    public List<String> getUserInfoList(@RequestParam("userId") String userId) {
        return userService.getUserInfoList(userId);
    }
}
