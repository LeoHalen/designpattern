package com.design.pattens.observer;

/**
 * 测试类测试观察者模式的实现
 *
 * @ProjectName: designpattern
 * @Description: java类作用描述
 * @Author: HALEN(李智刚)
 * @CreateDate: 2018/5/31 15:24
 * <p>Copyright: Copyright (c) 2018</p>
 */
public class Test {

    public static void main(String[] args) {

        XiaoMei xiaoMei = new XiaoMei();
        LaoWang laoWang  = new LaoWang();
        LaoLi laoLi = new LaoLi();

        //老王和老李需要在小美那里都注册一下
        xiaoMei.addPersion(laoWang);
        xiaoMei.addPersion(laoLi);

        //小美向老王和老李发出通知
        xiaoMei.notifyPerson();
    }

}
