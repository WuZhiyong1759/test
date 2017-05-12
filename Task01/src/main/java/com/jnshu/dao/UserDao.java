package com.jnshu.dao;

import com.jnshu.model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by Tom on 2017/5/4.
 */
@Component
@Repository
public interface UserDao {
    void insert(User user);
    User selectByNameAndPwd(User user);
    User selectById(int id);
}
