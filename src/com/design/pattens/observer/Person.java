package com.design.pattens.observer;

/**
 * 老王和老李通过这个接口可以接收到小美发过来的消息
 *
 * @ProjectName: designpattern
 * @Description: java类作用描述
 * @Author: HALEN(李智刚)
 * @CreateDate: 2018/5/31 15:12
 * <p>Copyright: Copyright (c) 2018</p>
 */
public interface Person {
    void getMessage(String message);
}
