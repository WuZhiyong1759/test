package com.jnshu.service;

import com.jnshu.dao.Vocation_msgDao;
import com.jnshu.model.Vocation_msg;

import java.util.List;

/**
 * Created by Tom on 2017/4/26.
 */
public interface VocationService {

    void addVocation(Vocation_msg vocation_msg);

    void deleteVocationById(int id);

    void updateVocation(Vocation_msg vocation_msg);

    Vocation_msg getVocationById(int id);

    List<Vocation_msg> getAllVocation();
}
