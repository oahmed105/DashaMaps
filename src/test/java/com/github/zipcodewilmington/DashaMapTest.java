package com.github.zipcodewilmington;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMapTest {
    @Test
    void set() {
    }

    @Test
    void delete() {
    }

    @Test
    void get() {
    }

    @Test
    void isEmpty() {
        DashaMap hm = new DashaMap();

        boolean actual = hm.isEmpty();

        Assert.assertTrue(actual);
    }

    @Test
    void isNotEmpty() {
        DashaMap hm = new DashaMap();
        hm.set("ayeeee", 1);

        boolean actual = hm.isEmpty();

        Assert.assertFalse(actual);
    }

    @Test
    void sizeNotEmptyTest() {
        DashaMap hm = new DashaMap();
        long expected = 1;
        hm.set("ayeeee", 1);


        long actual = hm.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    void sizeEmptyTest() {
        DashaMap hm = new DashaMap();
        long expected = 0;


        long actual = hm.size();

        Assert.assertEquals(expected, actual);
    }
}
