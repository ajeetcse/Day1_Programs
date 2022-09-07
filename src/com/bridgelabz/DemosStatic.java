package com.bridgelabz;

public class DemosStatic {
    static int x=10;
    static int y;
    static void sum(int z){
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("z = "+z);
    }
    static {
        System.out.println("Static block initial");
        y=x+5;
    }
    public static void main(String[] args) {
        sum(50);

    }
}
