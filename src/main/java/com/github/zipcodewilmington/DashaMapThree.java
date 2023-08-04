package com.github.zipcodewilmington;

public class DashaMapThree extends DashaMap{

    public DashaMapThree() {
        super();
    }

    private String HashFunctionThree(String input) {
        if (input.length() > 1) {
            return String.valueOf(Character.toLowerCase(input.charAt(0)+input.charAt(1)));
        }
        return null;
    }

    @Override
    public void set(String key, Integer value) {

    }

    @Override
    public Integer delete(String key) {
        return null;
    }

    @Override
    public Integer get(String key) {
        return null;
    }
}
