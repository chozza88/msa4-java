package com.msa4java.edu;

public class E01Variable {
    public static void main(String[] args) {
        // 변수 선언
        int age;
        age = 1;
        char ch = 'a';

        // 상수
        final String USER_NAME;
        USER_NAME = "둘리";

        // 두 변수의 값을 스와핑해보자
        int swap1 = 1;
        int swap2 = 2;
        int temp = 0;
        System.out.println("swap1 : " + swap1 + " swap2 : " + swap2);
        temp = swap1;
        swap1 = swap2;
        swap2 = temp;
        System.out.println("swap1 : " + swap1 + " swap2 : " + swap2);

        // Underscore 표기법
        int num2 = 200_000_000;

        // 데이터 타입
        boolean boo = false;
        byte bt = 127;
        short st = 32767;
        int integer = 2147483647;
        long longer = 2147483648L;

        double db =3.141592;
        float ft = 3.141592F;

        char ch2 = 'M';

        // 스트링의 비교
        String str1 = "홍길동";
        String str2 = "홍길동";
        System.out.println(str1.equals(str2));
        String name = "홍길동";
        String name1 = new String("홍길동");
        String name2 = name1;
        System.out.println(name == name1);
        System.out.println(name1 == name2);
        System.out.println(name.equals((name1)));
    }

}
