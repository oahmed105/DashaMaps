package com.github.zipcodewilmington.mylinkedlist;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    public void add() {
        MyLinkedList list = new MyLinkedList("manny");

        list.add("brent", 45);

        Assert.assertEquals(new MyNode("brent", 45),list.getHead().getNext());
    }

    @Test
    public void removeTest() {
        MyLinkedList list = new MyLinkedList("manny");
        String expectedKey = "brent";
        Integer expectedValue = 6;
        MyNode expected = new MyNode(expectedKey, expectedValue);
        list.add(expectedKey, expectedValue);

        Integer actualValue = list.remove(expectedKey);

        Assert.assertEquals(expectedValue, actualValue);
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void size1Test() {
        MyLinkedList list = new MyLinkedList("manny");

        Assert.assertEquals(1, list.size());
    }

    @Test
    public void size2Test() {
        MyLinkedList list = new MyLinkedList("manny");

        list.add("brent", 45);

        Assert.assertEquals(2, list.size());
    }

    @Test
    void getTest() {
        MyLinkedList list = new MyLinkedList("manny");
        String expectedKey = "brent";
        Integer expectedValue = 6;
        MyNode expected = new MyNode(expectedKey, expectedValue);
        list.add(expectedKey, expectedValue);

        MyNode actual = list.get(expectedKey);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmpty() {
        MyLinkedList list = new MyLinkedList("manny");
        list.add("brent", 5);

        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void isNotEmpty() {
        MyLinkedList list = new MyLinkedList("manny");
        list.add("brent", 5);
        list.remove("brent");

        Assert.assertTrue(list.isEmpty());
    }
}