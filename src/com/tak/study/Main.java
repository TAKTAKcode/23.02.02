package com.tak.study;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //입력받을 9개
        int[] arr = { sc.nextInt()
                    , sc.nextInt()
                    , sc.nextInt()
                    , sc.nextInt()
                    , sc.nextInt()
                    , sc.nextInt()
                    , sc.nextInt()
                    , sc.nextInt()
                    , sc.nextInt()
                    };

        //Scanner 메모리 누수 방지
        sc.close();


        int cnt = 0;
        int max = 0;
        int index = 0;

        //입력받은 배열을 향상된 for문으로 하나씩 대조하여 반복
        for (int value : arr) {

            //몇번째 열인지 확인하기 위함
            cnt++;

            //새로운 값(value)이 기존 최대값(max)보다 큰 경우 그 숫자의 cnt와 새로운값(value)을 새로 지정해준다.
            //for문이 끝나면 최종적으로 대입된 값을 출력한다.
            if (value > max) {

                max = value;
                index = cnt;
            }
        }

        System.out.println(max + "\n" + index);

    }

}
