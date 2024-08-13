package com.zhouyu.enums;

/**
 * @author yinhou.liu
 * @Date 2024/08/13
 */
public enum Season {
    SPRING("春天"), SUMMER("夏天"), AUTUMN("秋天"), WINTER("冬天");

    private String name;

    Season(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
