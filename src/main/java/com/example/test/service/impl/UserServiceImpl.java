package com.example.test.service.impl;

import com.example.test.bean.UserBean;
import com.example.test.dao.UserDao;
import com.example.test.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author rency
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public List<UserBean> getUserById(Integer userid) {
        return userDao.getUserById(userid);
    }
}
