package com.design.pattens.single.doublecheck;

/**
 * 双重检验锁实现单例模式
 *
 * @ProjectName: designpattern
 * @Description: java类作用描述
 * @Author: HALEN(李智刚)
 * @CreateDate: 2018/5/29 15:33
 * <p>Copyright: Copyright (c) 2018</p>
 */
public class Singleton {
    private volatile static Singleton singleton;

    private Singleton() {}

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
