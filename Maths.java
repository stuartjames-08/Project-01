package com.example.demo1001;
import java.util.Scanner;
 public class Maths {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        int mul = a*b;
        int sub = a-b;
        System.out.println("SUM : "+sum);
        System.out.println("MULTIPLE : "+ mul);
        System.out.println("SUBTRACT : "+ sub);
    }
}
