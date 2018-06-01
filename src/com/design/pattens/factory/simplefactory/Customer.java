package com.design.pattens.factory.simplefactory;

/**
 * 测试类（客户）
 *
 * @ProjectName: designpattern
 * @Description: java类作用描述
 * @Author: HALEN(李智刚)
 * @CreateDate: 2018/6/1 18:32
 * <p>Copyright: Copyright (c) 2018</p>
 */
public class Customer {
    public static void main(String[] args) {
        BMW320 bmw320 = new BMW320();
        BMW523 bmw523 = new BMW523();
    }
}
