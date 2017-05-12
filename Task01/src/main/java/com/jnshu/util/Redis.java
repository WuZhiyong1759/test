package com.jnshu.util;

import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

/**
 * Created by Tom on 2017/5/9.
 */
@Component
public class Redis {
    Jedis jedis=null;
    public Jedis getJedis(){
    try {
        jedis=new Jedis("localhost");
    }catch (Exception e){
        e.printStackTrace();
    }finally {
//        jedis=null;
        return jedis;
    }
}

}
