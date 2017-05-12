package com.jnshu.dao;

import com.jnshu.model.Vocation_msg;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Tom on 2017/4/26.
 */
@Repository
public interface Vocation_msgDao {

    void addVocation(Vocation_msg vocation_msg);

    void deleteVocationById(int id);

    void updateVocation(Vocation_msg vocation_msg);

    Vocation_msg getVocationById(int id);

    List<Vocation_msg> getAllVocation();

}
