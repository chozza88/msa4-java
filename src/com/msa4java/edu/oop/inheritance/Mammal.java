package com.msa4java.edu.oop.inheritance;

// 클래스에서 final을 정의하면 상속불가
public class Mammal {
    protected String name;
    protected String residence;

    public Mammal(String name, String residence){
        this.name = name;
        this.residence = residence;
    }

    // Method에 final을 정의하면 오버라이드 불가
    public void breath(){
        System.out.println(this.name + "이/가 폐호흡합니다.");
    }
}
