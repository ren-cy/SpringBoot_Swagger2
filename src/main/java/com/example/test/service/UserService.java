package com.example.test.service;

import com.example.test.bean.UserBean;

import java.util.List;

/**
 * @author rency
 */
public interface UserService {
    /**
     * aaa
     * @param userid
     * @return
     */
    List<UserBean> getUserById(Integer userid);
}
