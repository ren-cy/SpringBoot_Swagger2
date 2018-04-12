package com.example.test.dao;

import com.example.test.bean.UserBean;

import java.util.List;

/**
 * @author rency
 */
public interface UserDao {
    /**
     * aa
     * @param userid
     * @return
     */
    List<UserBean> getUserById(Integer userid);
}
