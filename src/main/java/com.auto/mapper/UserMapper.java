package com.auto.mapper;

import com.auto.domain.User;

import java.util.List;

/**
 * Created by sky on 17-6-29.
 */
public interface UserMapper {
    public User selectUserById(int userId);
}
