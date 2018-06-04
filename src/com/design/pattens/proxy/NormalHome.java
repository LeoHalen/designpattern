package com.design.pattens.proxy;

/**
 * 结婚家庭类
 *
 * @ProjectName: designpattern
 * @Description: java类作用描述
 * @Author: HALEN(李智刚)
 * @CreateDate: 2018/6/4 16:11
 * <p>Copyright: Copyright (c) 2018</p>
 */
public class NormalHome implements ProxyInterface{

    @Override
    public void marry() {
        System.out.println("我们结婚啦~");
    }
}
