package com.msa4java.edu;

import java.util.Arrays;

public class E05Array {
    public static void main(String[] args) {
        // 길이 5의 int 배열 생성 및 초기화
//        int[] arrInt = new int[5];
//        arrInt[2] = 50;
//        System.out.println(Arrays.toString(arrInt));
//        for(int i = 0; i < arrInt.length; i++) {
//            arrInt[i] = 10 * (i+1);
//        }
//        for(int i = 0; i < arrInt.length; i++ ){
//            System.out.println(arrInt[i]);
//        }

//        System.out.println("문자배열 초기화");
        // 길이 5의 char 배열 생성 및 초기화(요소의 값도 셋팅)
//        char[] arrChar = {'a','b','c','d'};
//        System.out.println(Arrays.toString(arrChar));
//        System.out.println(arrInt);
//        System.out.println(arrChar);
//        char[] arrChar = new char[5];
//        for(int i = 0; i < arrChar.length; i++){
//            arrChar[i] = (char)(97 + i);
//        }
//        for(int i = 0; i < arrChar.length; i++){
//            System.out.println(arrChar[i]);
//        }

        // 배열의 복사
//        int[] originArr = {1,2,3};
//        int[] copyArr = originArr;

//        copyArr[1] = 555;
//        System.out.println(originArr[1]);

        // for문을 이용한 복사
//        int[] originArr = {1,2,3};
//        int[] copyArr = new int[originArr.length];
//
//        for(int i = 0; i < originArr.length; i++){
//            copyArr[i] = originArr[i];
//        }
//        copyArr[1] = 55;
//        System.out.println(originArr[1]);

        // System.arraycopy() 이용해서 깊은 복사
//        int[] originArr = {1,2,3};
//        int[] copyArr = new int[originArr.length * 2];
//
//        System.arraycopy(originArr, 0, copyArr, 0, originArr.length);
//        for(int item : copyArr){
//            System.out.println(item);
//        }

        // Arrays.copyOf() 이용해서 깊은 복사
//        int[] originArr = {1,2,3};
//        int[] copyArr = new int[originArr.length * 2];
//        copyArr = Arrays.copyOf(originArr, originArr.length);
//        copyArr[1] = 55;
//        System.out.println(originArr[1]);

        // 다차원 배열
        int[][] arrMD = {
                {1,2,3}
                ,{4,5,6}
                ,{7,8,9}
        };
        System.out.println(arrMD[2][2]);

        // 배열의 API
        int[] arrInt1 = {1,2,3};
        int[] arrInt2 = {1,2,3};
        // 배열의 길이 반환
        System.out.println(arrInt1.length);

        // 배열의 비교
        System.out.println(Arrays.equals(arrInt1, arrInt2));

        // 다차원 배열의 비교
        int[][] arrIntDM1 = {{1,2,3},{4,5,6}};
        int[][] arrIntDM2 = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepEquals(arrIntDM1, arrIntDM2));

        // 배열의 정렬
        int[] arrSort = {5,3,2,42,55};
        Arrays.sort(arrSort);
        System.out.println(Arrays.toString(arrSort));

    }
}
