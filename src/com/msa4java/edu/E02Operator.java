package com.msa4java.edu;

public class E02Operator {
    public static void main(String[] args) {
        // 산술 연산자
        int num1 = 5;
        int num2 = 10;

        int sum = num1 + num2;
        System.out.println(sum);
        int minus = num1 - num2;
        int multiply = num1 * num2;
        double divide = (double)num1 / num2;
        System.out.println(divide);
        int mod = num1 % num2;
        System.out.println(num1 % num2);

        // 산술대입연산자
        num1 += 1;
        num1 -= 1;
        num1 *= 5;
        num1 /= 5;
        num1 %= 2;

        // 증감연산자
        num1++;
        ++num1;
        num1 = 0;
        System.out.println(num1++);
        System.out.println(num1);

        // 비교 연산자
        num1 = 1;
        num2 = 2;
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);

        // 문자열의 비교
        String str = "자바";
        System.out.println(str.equals("자바"));

        // 논리 연산자
        System.out.println(num1 == num2 && num1 > 3);
        System.out.println(num1 == num2 || num1 > 3);
        System.out.println(!(num1 == num2)); // !연산자는 결론으로 나온 논리값을 반대로 반환

        // 삼항 연산자
        String result = num1 > num2 ? "num1이 큼" : "아아";
        // 조건식이 true일 때 첫번째 값을 반환, false일 때 두번째 값을 반환
        System.out.println(result);
    }
}
