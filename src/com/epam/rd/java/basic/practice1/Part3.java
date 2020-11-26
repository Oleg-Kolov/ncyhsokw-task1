package com.epam.rd.java.basic.practice1;

public class Part3 {

    public static void main(String[] args) {
        String result = "";
        for (int i = 0; i < args.length; i++)
            result += ((i + 1) == args.length) ? (args[i]) : (args[i] + " ");
        System.out.println(result);
    }
	
}
