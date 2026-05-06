package com.msa4java.edu.oop;
// class : 객체를 정의하기 위한 최소 단위
public class Whale {
   // Class는 Field와 Method로 구성되어 있다.
    public String name = "고래"; // field(속성)
    // 보통 유틸성으로 사용할 때 만듦
    public static int age = 20;

    // Method(행위)
    public void swimming(){
        System.out.println("고래가 헤엄칩니다.");
    }

    // Static Method
    public static void breath(String str){
        System.out.println(str + "고래가 폐호흡합니다.");
    }
}




