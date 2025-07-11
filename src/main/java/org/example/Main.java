package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        int a = 10;
        int b = 20;
        System.out.println(a+b);
        //대입연산자
        int x = 5;
        x += 3; // x = x + 3 → 8
        System.out.println(x);
        //비교연산자
        int num = 5;
        System.out.println(num == 5); // true
        //논리연산자
        boolean result = (5 > 3) && (10 > 5); // true
        //증감 연산자
        int i = 1;
        i++; // i = 2
       //조건삼항) 연산자
        int score = 85;
        String grade = (score >= 90) ? "A" : "B";
      //비트 연산자
        int n = 5; // 0101
        int m = 3; // 0011
        System.out.println(n & m); // 1 (0001)

     //if문
        int num1 = 10;
        if (num1 > 0) {
            System.out.println("양수입니다.");
        } else if (num1 == 0) {
            System.out.println("0입니다.");
        } else {
            System.out.println("음수입니다.");
        }

     // switch 문
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            default:
                System.out.println("기타 요일");
                break;
        }
    //for 문
        for (int j = 0; j < 5; j++) {
            System.out.println(j);
        }
    //while 문
        int count = 3;
        while (count > 0) {
            System.out.println(count);
            count--;
        }
    //do-while 문
        int num2= 0;
        do {
            System.out.println(num2);
            num2++;
        } while (num2< 3);

        int[] arr = {1, 2, 3};
        System.out.println(arr[0]); // 1
        arr[1] = 10;
        System.out.println(arr[1]); // 10



   }
}