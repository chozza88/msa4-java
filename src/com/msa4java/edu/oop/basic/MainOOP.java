package com.msa4java.edu.oop.basic;

public class MainOOP {

    public static void main(String[] args) {
        // Whale 클래스를  인스턴스 생성
//        Whale whale = new Whale();
//        System.out.println(whale.name);
//        whale.swimming();
        
        // static 멤버들에게 접근
        System.out.println(Whale.age);
        Whale.breath("큰 ");

        // 접근 제어 지시자 확인용
        AccessModifier accessModifier = new AccessModifier();

        Overloading overloading = new Overloading();
        overloading.print();
        overloading.print('k');
        overloading.print(1,2);


        // 생성자
        ConJava conJava = new ConJava(20);
        ConJava conJava1 = new ConJava(30);
        System.out.println(conJava.age);
        System.out.println(conJava1.age);

        Marine marine = new Marine(40, 6, 0);
        int marginHp = marine.getHp();
        System.out.println(marginHp);
        marine.setHp((1000));
        System.out.println(marine.getHp());

        Marine marine2 = new Marine();
        System.out.println(marine2.getHp());

        Marine marine3 = new Marine(30);
        System.out.println(marine3.getHp());

    }
}
