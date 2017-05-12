package com.jnshu.impl;

import com.jnshu.dao.UserDao;
import com.jnshu.model.User;
import com.jnshu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Tom on 2017/5/4.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService{
    @Resource
    @Autowired
    UserDao userDao;

    @Override
    public void insert(User user) {
        userDao.insert(user);
    }

    @Override
    public User select(User user) {
        return userDao.selectByNameAndPwd(user);
    }

    @Override
    public User selectById(int id) {
        return userDao.selectById(id);
    }
}
