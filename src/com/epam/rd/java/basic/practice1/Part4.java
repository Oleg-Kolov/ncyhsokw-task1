package com.epam.rd.java.basic.practice1;

public class Part4 {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int nod = nod(x, y);
        System.out.println(nod);
    }

    public static int nod(int x, int y) {
        while (x != y) {
            if (x > y)
                x -= y;
            else
                y -= x;
        }
        return x;
    }

}
