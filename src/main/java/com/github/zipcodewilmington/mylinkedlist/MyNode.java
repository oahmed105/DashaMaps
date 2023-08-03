package com.github.zipcodewilmington.mylinkedlist;

import java.util.Objects;

public class MyNode {
    private MyPair data;
    private MyNode next;

    public MyNode(String key, Integer value) {
        data = new MyPair(key, value);
        next = null;
    }

    public MyPair getPair() {
        return data;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyNode)) return false;
        MyNode myNode = (MyNode) o;
        return Objects.equals(getPair(), myNode.getPair()) && Objects.equals(getNext(), myNode.getNext());
    }

}
