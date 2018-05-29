package com.design.pattens.single.hungryer.threaddanger;

/**
 * 懒汉模式（线程不安全）
 *
 * @ProjectName: designpattern
 * @Description: java类作用描述
 * @Author: HALEN(李智刚)
 * @CreateDate: 2018/5/29 11:25
 * <p>Copyright: Copyright (c) 2018</p>
 */
public class Singleton {
    private static  Singleton singleton;

    public Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
