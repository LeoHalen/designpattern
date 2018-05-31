package com.design.pattens.observer;

/**
 * 这个接口就相当于老王的电话号码，小美发送通知的时候
 * 就会拨打getMessage这个电话，拨打电话就是调用接口
 *
 * @ProjectName: designpattern
 * @Description: java类作用描述
 * @Author: HALEN(李智刚)
 * @CreateDate: 2018/5/31 15:14
 * <p>Copyright: Copyright (c) 2018</p>
 */
public class LaoWang implements Person{

    private String name = "老王";

    public LaoWang() {}

    @Override
    public void getMessage(String message) {
        System.out.println(name + "接到了小美打过来的电话，电话内容是："+ message);
    }
}
