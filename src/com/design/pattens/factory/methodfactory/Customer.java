package com.design.pattens.factory.methodfactory;

/**
 * 测试类（客户）
 *
 * @ProjectName: designpattern
 * @Description: java类作用描述
 * @Author: HALEN(李智刚)
 * @CreateDate: 2018/6/1 18:42
 * <p>Copyright: Copyright (c) 2018</p>
 */
public class Customer {
    public static void main(String[] args) {
        Factory factory = new Factory();
        BMW bmw320 = factory.createBMW(320);
        BMW bmw523 = factory.createBMW(523);
    }
}
