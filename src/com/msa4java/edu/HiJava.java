package com.msa4java.edu;

public class HiJava {
//    static : 클래스가 로딩될 때 딱 한 번 올라가서, 모든 객체가 공유하는 것
    public static void main(String[] args){
        System.out.println(1);
        System.out.print(2);
        System.out.print(2);

        String str = "자바";
        int num = 54;

        System.out.printf("%n안녕 %s :%d%n", str, num);
        System.out.println("안녕 "+str+" :"+num);

        byte max = 127;
        byte min = -128;

        System.out.println((byte)(max + 1));
        System.out.println((byte)(min - 1));


    }
}
