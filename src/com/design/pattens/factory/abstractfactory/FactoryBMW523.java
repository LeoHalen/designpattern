package com.design.pattens.factory.abstractfactory;

/**
 * 宝马523工厂类
 *
 * @ProjectName: designpattern
 * @Description: java类作用描述
 * @Author: HALEN(李智刚)
 * @CreateDate: 2018/6/1 18:47
 * <p>Copyright: Copyright (c) 2018</p>
 */
public class FactoryBMW523 implements FactoryBMW{

    @Override
    public BMW523 createBMW() {
        return new BMW523();
    }
}
