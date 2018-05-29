package com.design.pattens.single.staticinner;

/**
 * 静态内部类实现单列模式
 *
 * @ProjectName: designpattern
 * @Description: java类作用描述
 * @Author: HALEN(李智刚)
 * @CreateDate: 2018/5/29 14:29
 * <p>Copyright: Copyright (c) 2018</p>
 */
public class Singleton {
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public Singleton() {}

    public static final Singleton getInstance() {
        return  SingletonHolder.INSTANCE;
    }
}
