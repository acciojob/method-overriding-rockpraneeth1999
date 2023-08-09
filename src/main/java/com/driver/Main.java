package com.driver;

public class Main {

    public static class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }

    public static class B extends A{
        public String meth(){
            return "Method is overridden in Extendend class B";
        }
    }

    public static void main(String[] args) {
        B obj1=new B();
        B obj2=new B();

        System.out.println(obj1.meth());
        System.out.println(obj2.meth());
    }
}