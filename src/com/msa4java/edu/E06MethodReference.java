package com.msa4java.edu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E06MethodReference {
    public static void main(String[] args) {
        // 메서드 참조
        List<Integer> list = Arrays.asList(1,2,3,4);

        list.forEach(i->{
            System.out.println(i);
        });

        // 메서드 참조 형식
        list.forEach(System.out::println);

        List<String> strList = Arrays.asList("Hong", "Dul");
        strList.forEach(str->str.toUpperCase());
        strList.forEach(String::toUpperCase);




    }
}
