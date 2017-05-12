package com.jnshu.service;

import com.jnshu.model.User;

/**
 * Created by Tom on 2017/5/4.
 */
public interface UserService {
    void insert(User user);

    User select(User user);

    User selectById(int id);
}
