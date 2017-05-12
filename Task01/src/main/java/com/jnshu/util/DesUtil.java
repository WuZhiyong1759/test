package com.jnshu.util;

import org.springframework.stereotype.Component;

import javax.crypto.*;
import javax.crypto.spec.DESKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;

/**
 * Created by Tom on 2017/5/4.
 */
@Component
public class DesUtil {
    //加密部分
    public static byte[] encrypt(String datasource,String password){
        try {
            SecureRandom random =new SecureRandom();
            DESKeySpec desKey=new DESKeySpec(password.getBytes());
            //穿件一个秘钥工厂,然后用它把DESKeySpec转换
            SecretKeyFactory keyFactory=SecretKeyFactory.getInstance("DES");
            SecretKey secretKey =keyFactory.generateSecret(desKey);

            //Cipher对象实际完成加密操作
            Cipher cipher =Cipher.getInstance("DES");
            cipher.init(Cipher.ENCRYPT_MODE,secretKey,random);
            // 现在获取数据并加密
//        正式执行加密操作
            return cipher.doFinal(datasource.getBytes());

        }catch (Throwable e){
            e.printStackTrace();
        }
        return null;
    }

    /*
    *解密过程
     */
    public static byte[] decrypt(byte[] src,String  password) throws Exception{
//    DES算法要求一个可信任的随即资源
        SecureRandom random = new SecureRandom();
//    创建一个DESKeySpec对象
        DESKeySpec desKey = new DESKeySpec(password.getBytes());
//    创建一个秘钥工厂
        SecretKeyFactory keyFactory =SecretKeyFactory.getInstance("DES");
//    讲DES对象转换为SecretKey对象
        SecretKey secretKey =keyFactory.generateSecret(desKey);
//    Cipher对象实际完成解密操作
        Cipher cipher =Cipher.getInstance("DES");
//    用秘钥初始化Cipher对象
        cipher.init(Cipher.DECRYPT_MODE,secretKey,random);
//    真正的开始解密操作
        return  cipher.doFinal(src);
    }

//    public static void main(String[] args){
//        DesUtil desUtil = new DesUtil();
//
//        String str="woshiwuzhiy";
//        String password ="12345678";
//        byte[] result=desUtil.encrypt(str,password);
//        System.out.println("加密后的内容为："+new String(result));
//
//        try {
//            byte[] decryResult= desUtil.decrypt(result,password);
//            System.out.println("解密后的内容为：" +new String(decryResult));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}

