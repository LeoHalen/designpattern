package com.design.pattens.adapter;

/**
 * 测试类
 *
 * @ProjectName: designpattern
 * @Description: java类作用描述
 * @Author: HALEN(李智刚)
 * @CreateDate: 2018/6/1 17:44
 * <p>Copyright: Copyright (c) 2018</p>
 */
public class Test {

    public static void main(String[] args) {
        Phone phone = new Phone();
        VoltageAdapter adapter = new VoltageAdapter();
        phone.setAdapter(adapter);
        phone.charge();
    }
}
