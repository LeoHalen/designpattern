package com.design.pattens.adapter;

/**
 * 变压器类
 *
 * @ProjectName: designpattern
 * @Description: java类作用描述
 * @Author: HALEN(李智刚)
 * @CreateDate: 2018/6/1 17:37
 * <p>Copyright: Copyright (c) 2018</p>
 */
public class VoltageAdapter {

    //改变电压的功能
    public void changeVoltage() {
        System.out.println("正常充电中...");
        System.out.println("原始电压：" + Phone.V + "V");
        System.out.println("经变压器变压后电压：" + (Phone.V-200) + "V");
    }
}
