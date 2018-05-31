package com.design.pattens.decorator;

/**
 * 奶油类继承Food类
 *
 * @ProjectName: designpattern
 * @Description: java类作用描述
 * @Author: HALEN(李智刚)
 * @CreateDate: 2018/5/31 16:00
 * <p>Copyright: Copyright (c) 2018</p>
 */
public class Cream extends Food{

    private Food basicFood;

    public Cream(Food basicFood) {
        this.basicFood = basicFood;
    }

    public String make() {
        return basicFood.make() + "+奶油";
    }
}
