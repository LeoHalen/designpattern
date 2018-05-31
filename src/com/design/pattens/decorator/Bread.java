package com.design.pattens.decorator;

/**
 * 面包类继承Food类
 *
 * @ProjectName: designpattern
 * @Description: java类作用描述
 * @Author: HALEN(李智刚)
 * @CreateDate: 2018/5/31 15:57
 * <p>Copyright: Copyright (c) 2018</p>
 */
public class Bread extends Food{

    private Food basicFood;

    public Bread(Food basicFood) {
        this.basicFood = basicFood;
    }

    public String make() {
        return basicFood.make() + "+面包";
    }
}
