package com.github.zipcodewilmington.mylinkedlist;

import java.util.Objects;

public class MyLinkedList {

    private MyNode head;

    public MyLinkedList(String key) {
        head = new MyNode(key, null);
    }

    public MyNode getHead() {
        return head;
    }

    public void add(String key, Integer value) {
        MyNode temp = head;

        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(new MyNode(key, value));
    }

    public Integer remove(String key) {
        MyNode prev = head;
        MyNode temp = head;

        while (temp.getNext() != null && !temp.getPair().getKey().equals(key)) {
            prev = temp;
            temp = temp.getNext();
        }
        if (temp == null) {
            return null;
        }
        prev.setNext(temp.getNext());
        return temp.getPair().getValue();
    }

    public MyNode get(String key) {
        MyNode temp = head;

        while (temp != null) {
            temp = temp.getNext();
            if (temp.getPair().getKey().equals(key)) {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }

    public int size() {
        MyNode temp = head;
        int counter = 1;

        while (temp.getNext() != null) {
            temp = temp.getNext();
            counter++;
        }
        return counter;
    }

    public boolean isEmpty() {
        return head.getNext() == null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyLinkedList)) return false;
        MyLinkedList that = (MyLinkedList) o;
        return Objects.equals(getHead(), that.getHead());
    }

}
