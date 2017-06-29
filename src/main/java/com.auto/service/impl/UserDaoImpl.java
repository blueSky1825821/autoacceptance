package com.auto.service.impl;

import com.auto.dao.UserDao;
import com.auto.domain.User;
import com.auto.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by sky on 17-6-29.
 */
@Component
public class UserDaoImpl implements UserDao {
    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id) {
        return userMapper.selectUserById(id);
    }
}
