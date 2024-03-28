package com.learn._03_anno._03_inject._01_inject_value.complexBean;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component()
public class Element {
    private String name = "element";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Element{" +
                "name='" + name + '\'' +
                "class='" + getClass().getName() + "@" + Integer.toHexString(hashCode()) +
                '}';
    }
}
