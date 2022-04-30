package com.company;

import java.util.Scanner;

public class Main {

    static int fibonacci(int n){
        if (n==1 || n==2){
            return 1;
        }else{
            return fibonacci(n-1)+ fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n;
        System.out.println("O número é:");
        n = ler.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println(fibonacci(i));
        }
    }
}
