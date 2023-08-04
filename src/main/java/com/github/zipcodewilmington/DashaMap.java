package com.github.zipcodewilmington;

import com.github.zipcodewilmington.mylinkedlist.MyLinkedList;
import com.github.zipcodewilmington.mylinkedlist.MyPair;

import java.util.HashMap;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public abstract class DashaMap implements HashMapX {

    protected MyLinkedList[] dash;
    protected String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public DashaMap() {
        dash = new MyLinkedList[26];

        for (int i = 0; i < dash.length; i++){
            dash[i] = new MyLinkedList("" + alphabet.charAt(i));
        }
    }

    @Override
    public boolean isEmpty() {
        for (MyLinkedList list: dash){
            if (!list.isEmpty()){
                return false;
            }
        }
        return true;
    }

    @Override
    public long size() {
        long totalSize = 0;
        for (MyLinkedList list: dash){
            if (!list.isEmpty()){
                totalSize += list.size();
            }
        }
        return totalSize;
    }

    //key should be a letter
    @Override
    public int bucketSize(String key) {
        return dash[getBucketIndex(key)].size();
    }

    protected int getBucketIndex(String key) {
        return alphabet.indexOf(key);
    }
}
