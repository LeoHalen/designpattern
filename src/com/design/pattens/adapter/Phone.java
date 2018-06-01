package com.design.pattens.adapter;

/**
 * 手机类
 *
 * @ProjectName: designpattern
 * @Description: java类作用描述
 * @Author: HALEN(李智刚)
 * @CreateDate: 2018/6/1 17:35
 * <p>Copyright: Copyright (c) 2018</p>
 */
public class Phone {

    public static final int V = 220;//正常电压 220v

    private VoltageAdapter adapter;

    //充电
    public void charge() {
        adapter.changeVoltage();
    }

    public void setAdapter(VoltageAdapter adapter) {
        this.adapter = adapter;
    }
}
