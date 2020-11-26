package com.epam.rd.java.basic.practice1;

public class Part6 {

    public static void main(String[] args) {
        int count = Integer.parseInt(args[0]);
        int[] mass = new int[count];
        int number = 2;
        for (int i = 0; i < count; i++) {
            boolean status = isPrime(number);
            if (status == true) {
                mass[i] = number++;
                continue;
            }
            number++;
            i--;
        }
        for (int j : mass) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static boolean isPrime(int n) {
        if (n <= 3) {
            return true;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }	

}
