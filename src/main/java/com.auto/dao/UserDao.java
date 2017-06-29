package com.auto.dao;

import com.auto.domain.User;

/**
 * Created by sky on 17-6-29.
 */
public interface UserDao {
    /**
     * 根据用户ID查询用户信息
     * @param id
     * @return
     */
    public User findUserById(int id);
}
