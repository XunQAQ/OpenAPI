package com.watson.project.model.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * interface Status Enum
 *
 * @author watson
 */
public enum InterfaceInfoEnum {

    OFFLINE("Online", 0),
    ONLINE("Offline", 1);

    private final String text;

    private final int value;

    InterfaceInfoEnum(String text, int value) {
        this.text = text;
        this.value = value;
    }

    /**
     * 获取值列表
     *
     * @return
     */
    public static List<Integer> getValues() {
        return Arrays.stream(values()).map(item -> item.value).collect(Collectors.toList());
    }

    public int getValue() {
        return value;
    }

    public String getText() {
        return text;
    }
}
