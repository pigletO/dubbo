package com.pig1et.chapter.dubbo.provider.impl.user;

import com.pig1et.chapter.dubbo.expose.user.UserService;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.Arrays;
import java.util.List;

/**
 * @description: user实现类
 * @author: pig1etO
 * @create: 2020-10-21 15:41
 **/
@DubboService
public class UserServiceImpl implements UserService {

    @Override
    public List<String> getUserInfoList(String userId) {
        return Arrays.asList("XXX", userId, "男", "北京市乌拉乌拉乌拉乌拉乌拉");
    }
}
