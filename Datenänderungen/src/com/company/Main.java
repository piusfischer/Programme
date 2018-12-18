package com.company;

public class Main {


    public static void modifyPrimitive(int a)
    {
        a=5;
    }
    public static void modifyString(String s)
    {
        s="hallo";
    }
    public static void modifyObject(DtContainer c)
    {
        c.a=4;
        c.s="hallo";
    }
    public static void main(String[] args) {
	// write your code here
        int a=8;
        modifyPrimitive(a);
        system.out.print(a);
        String s="h";
        modifyString(s);
        system.out.print(s);
        DtContainer d=new DtContainer();
        modifyObject(d);
        system.out.print(d);
    }
}
