package com.stelnykovych.java8;

import java.util.List;

public class Methods {

    //  Вернуть количество вхождений объекта «a1»
    public int countA1(List<String> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            String value = list.get(i);
            if ("a1".equals(value)) {
                count++;
            }
        }
        return count;
    }
}