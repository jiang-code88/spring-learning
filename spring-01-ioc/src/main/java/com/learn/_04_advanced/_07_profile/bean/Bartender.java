package com.learn._04_advanced._07_profile.bean;

/**
 * 调酒师类
 *  - 通过配置类的形式使用模块导入
 */
public class Bartender {
    private String name;

    public Bartender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
