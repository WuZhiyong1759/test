package com.jnshu.util;

import org.springframework.stereotype.Component;

import java.io.*;

/**
 * Created by Tom on 2017/5/9.
 */
@Component
public class SerializeUtil {

    public static byte[] serialize(Object object){
        ObjectOutputStream obi=null;
        ByteArrayOutputStream bai=null;
        try {
            bai=new ByteArrayOutputStream();
            obi=new ObjectOutputStream(bai);
            obi.writeObject(object);
            byte[] byt=bai.toByteArray();
            return byt;
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
    public static Object unserizlize(byte[] bytes){
        ObjectInputStream oii=null;
        ByteArrayInputStream bis=null;
        try {
            bis=new ByteArrayInputStream(bytes);
            oii=new ObjectInputStream(bis);
            Object object=oii.readObject();
            return object;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
