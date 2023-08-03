package com.github.zipcodewilmington.mylinkedlist;

import java.util.Objects;

public class MyPair {
    private String key;
    private Integer value;

    public MyPair(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyPair)) return false;
        MyPair myPair = (MyPair) o;
        return Objects.equals(getKey(), myPair.getKey()) && Objects.equals(getValue(), myPair.getValue());
    }

}
