package com.design.pattens.single.idler;

/**
 * 饿汉模式
 *
 * @ProjectName: designpattern
 * @Description: java类作用描述
 * @Author: HALEN(李智刚)
 * @CreateDate: 2018/5/29 11:33
 * <p>Copyright: Copyright (c) 2018</p>
 */
public class Singleton {
    private static Singleton singleton;

    public Singleton(){}

    public static Singleton getInstance() {
        return singleton;
    }
}
