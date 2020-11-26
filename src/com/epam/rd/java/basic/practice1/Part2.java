package com.epam.rd.java.basic.practice1;

public class Part2 {

    public static void main(String[] args) {
        int result = 0;
        for (String number : args) {
            result += Integer.parseInt(number);
        }
        System.out.println(result);

    }
	
}