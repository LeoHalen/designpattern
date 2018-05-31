package com.design.pattens.decorator;

/**
 * Food类，让其他所有食物都来继承这个类
 *
 * @ProjectName: designpattern
 * @Description: java类作用描述
 * @Author: HALEN(李智刚)
 * @CreateDate: 2018/5/31 15:50
 * <p>Copyright: Copyright (c) 2018</p>
 */
public class Food {

    private String foodName;

    public Food() {}

    public Food(String foodName) {
        this.foodName = foodName;
    }

    public String make() {
        return foodName;
    }
}
