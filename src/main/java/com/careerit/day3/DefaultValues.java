package com.careerit.day3;

public class DefaultValues {
    byte b;
    short s;
    int i;
    double d;
    boolean flag;
    long l;
    float f;
 char ch;
 String name;

    public static void main(String[] args) {
        DefaultValues obj = new DefaultValues();
        System.out.println("byte:"+obj.b);
        System.out.println("float:"+obj.f);
        System.out.println("byte:"+obj.b);
        System.out.println("double:"+obj.d);
        System.out.println("boolean:"+obj.flag);
        System.out.println("short:"+obj.s);
        System.out.println("int:"+obj.i);
        System.out.println("long:"+obj.l);
        System.out.println("char:"+obj.ch);
        System.out.println("string:"+obj.name);
    }
}
