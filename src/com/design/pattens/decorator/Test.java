package com.design.pattens.decorator;

/**
 * 测试类
 *
 * @ProjectName: designpattern
 * @Description: java类作用描述
 * @Author: HALEN(李智刚)
 * @CreateDate: 2018/5/31 16:03
 * <p>Copyright: Copyright (c) 2018</p>
 */
public class Test {

    public static void main(String[] args) {
        Food food = new Bread(new Vegetable(new Cream(new Food("香肠"))));
        System.out.println(food.make());
    }
}
