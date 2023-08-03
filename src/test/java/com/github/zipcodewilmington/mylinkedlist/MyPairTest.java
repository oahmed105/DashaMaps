package com.github.zipcodewilmington.mylinkedlist;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class MyPairTest {

    @Test
    void setKeyTest() {
        MyPair pair = new MyPair("no", 1);

        pair.setKey("pain");

        Assert.assertEquals("pain", pair.getKey());
    }

    @Test
    void setValue() {
        MyPair pair = new MyPair("no", 1);

        Integer expected = 34;
        pair.setValue(expected);

        Integer actual = pair.getValue();

        Assert.assertEquals(expected, actual);
    }

    @Test
    void equalsTest() {
        MyPair pair = new MyPair("no", 1);
        MyPair pair2 = new MyPair("no", 1);

        Assert.assertEquals(pair, pair2);
    }
}