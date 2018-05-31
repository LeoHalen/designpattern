package com.design.pattens.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * java类简单作用描述
 *
 * @ProjectName: designpattern
 * @Description: java类作用描述
 * @Author: HALEN(李智刚)
 * @CreateDate: 2018/5/31 15:20
 * <p>Copyright: Copyright (c) 2018</p>
 */
public class XiaoMei {

    private List<Person> list = new ArrayList<>();

    public XiaoMei() {}

    public void addPersion(Person person) {
        list.add(person);
    }

    //遍历list,把自己的通知发送给所有暗恋自己的人
    public void notifyPerson() {
        for (Person person : list) {
            person.getMessage("今天家里只有我一个人，你们过来吧，谁先过来谁就能得到我！");
        }
    }
}
