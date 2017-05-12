package com.jnshu.impl;

import com.jnshu.dao.Vocation_msgDao;
import com.jnshu.model.Vocation_msg;
import com.jnshu.service.VocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Tom on 2017/4/26.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class VocationServiceImpl implements VocationService{
    @Autowired
    @Resource
    Vocation_msgDao vocation_msgDao;


    @Override
    public void addVocation(Vocation_msg vocation_msg) {
        vocation_msgDao.addVocation(vocation_msg);
    }

    @Override
    public void deleteVocationById(int id) {
        vocation_msgDao.deleteVocationById(id);
    }

    @Override
    public void updateVocation(Vocation_msg vocation_msg) {
        vocation_msgDao.updateVocation(vocation_msg);
    }

    @Override
    public Vocation_msg getVocationById(int id) {
        return vocation_msgDao.getVocationById(id);
    }

    @Override
    public List<Vocation_msg> getAllVocation() {
        return vocation_msgDao.getAllVocation();
    }
}
