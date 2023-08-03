package com.github.zipcodewilmington.mylinkedlist;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyNodeTest {

    @Test
    void setNextTest() {
        MyNode first = new MyNode("john", 56);
        MyNode second = new MyNode("jimmy", 45);

        first.setNext(second);

        Assert.assertEquals(second, first.getNext());
    }

    @Test
    void equalsTest() {
        MyNode node = new MyNode("paul", 45);
        MyNode node1 = new MyNode("paul", 45);

        Assert.assertEquals(node, node1);
    }
}