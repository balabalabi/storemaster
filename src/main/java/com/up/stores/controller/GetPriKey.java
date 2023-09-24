package com.up.stores.controller;

import java.util.Random;
//该方法的目的是生成一个唯一的、随机的私钥，用于标识某个特定的实体或操作。
// 私钥的生成方式是通过当前时间的毫秒数和一个随机数相加，以增加其唯一性和随机性。
public class GetPriKey {
    public static Integer get(){
        Random random = new Random();
        int num= random.nextInt(10000);
        int l =(int)System.currentTimeMillis();
        return l+num;
    }
}
