package com.design.pattens.decorator;

/**
 * 蔬菜类继承Food类
 *
 * @ProjectName: designpattern
 * @Description: java类作用描述
 * @Author: HALEN(李智刚)
 * @CreateDate: 2018/5/31 16:02
 * <p>Copyright: Copyright (c) 2018</p>
 */
public class Vegetable extends Food{

    private Food basicFood;

    public Vegetable(Food basicFood) {
        this.basicFood = basicFood;
    }

    public String make() {
        return basicFood.make() + "+蔬菜";
    }
}
