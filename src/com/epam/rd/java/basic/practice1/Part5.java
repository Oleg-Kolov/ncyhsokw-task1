package com.epam.rd.java.basic.practice1;

public class Part5 {

    public static void main(String[] args) {
        int result = 0;
        String[] mass = args[0].split("");
        for (String str : mass) {
            result += Integer.parseInt(str);
        }
        System.out.println(result);
    }
	
}
