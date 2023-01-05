package com.bridgelabz.assinments;

public class StaticVarMethod {
    static int staticVar;

    static void m1(){
        System.out.println(staticVar); // 49
        staticVar = 32;
        System.out.println(staticVar); // 32
    }

    public static void main(String[] args) {
        System.out.println(staticVar); // 0
        staticVar = 49;
        System.out.println(staticVar); // 49
        m1();
        System.out.println(staticVar); // 32
        staticVar = 50;
        System.out.println(staticVar); // 50
    }
}
