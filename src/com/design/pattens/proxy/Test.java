package com.design.pattens.proxy;

/**
 * 测试类
 *
 * @ProjectName: designpattern
 * @Description: java类作用描述
 * @Author: HALEN(李智刚)
 * @CreateDate: 2018/6/4 16:12
 * <p>Copyright: Copyright (c) 2018</p>
 */
public class Test {
    public static void main(String[] args) {
        ProxyInterface proxyInterface = new WeddingCompany(new NormalHome());
        proxyInterface.marry();
    }
}
