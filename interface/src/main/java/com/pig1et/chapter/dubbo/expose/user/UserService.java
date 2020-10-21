package com.pig1et.chapter.dubbo.expose.user;

import java.util.List;

/**
 * @description: 用户接口
 * @author: pig1etO
 * @create: 2020-10-21 14:33
 **/
public interface UserService {

    List<String> getUserInfoList(String userId);
}
