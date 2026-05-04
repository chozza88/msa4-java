package com.msa4java.edu;

public class E05Array {
    public static void main(String[] args) {
        // 길이 5의 int 배열 생성 및 초기화
        int[] arrInt = new int[5];
        for(int i = 0; i < arrInt.length; i++) {
            arrInt[i] = 10 * (i+1);
        }
        for(int i = 0; i < arrInt.length; i++ ){
            System.out.println(arrInt[i]);
        }

        System.out.println("문자배열 초기화");
        // 길이 5의 char 배열 생성 및 초기화(요소의 값도 셋팅)
        // char[] arrChar = {'a','b','c','d'};
        char[] arrChar = new char[5];
        for(int i = 0; i < arrChar.length; i++){
            arrChar[i] = (char)(97 + i);
        }
        for(int i = 0; i < arrChar.length; i++){
            System.out.println(arrChar[i]);
        }
    }
}
