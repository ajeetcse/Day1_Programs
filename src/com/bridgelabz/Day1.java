package com.bridgelabz;

import java.util.Scanner;

public class Day1 {
    public void displayMessage(){
        System.out.println("hello world ");

    }
    public void primitiveDataTypes(){
       int a = 0;
        float b = 0;
        boolean c = false;
        double d = 0;
        char e = 0;
        long f = 0;
        String g = null;
        System.out.println("interger "+a);
        System.out.println("float "+b);
        System.out.println("boolean "+c);
        System.out.println("double "+d);
        System.out.println("char "+e);
        System.out.println("long "+f);
       // System.out.println("");
        System.out.println("String "+g);

    }
    public void checkString(){
        String a="ajeet";
        String b="mohit";
        System.out.println("String compare "+a.equals(b));

    }
    public void tryCatch(){
        try {
            int a=50;
            int b=0;
            int c=a/0;
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("hello");
    }
    public void leepYear(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        int year = sc.nextInt();
        if (((year%4==0)&&(year%100!=0))||(year%400==0)){
            System.out.println("leep year");
        }else {
            System.out.println("not leep year");
        }
    }

    public static void main(String[] args) {
        Day1 d1 = new Day1();
        d1.displayMessage();
        d1.primitiveDataTypes();
        d1.checkString();
        d1.tryCatch();
        d1.leepYear();
    }
}
