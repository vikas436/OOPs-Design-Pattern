package com.designpattern;

class Singleton {
    private static Singleton singleton = null;
    private String name = "singleton";

    private Singleton(){}

    public static Singleton getInstance() {
        if(singleton==null) {
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }

    public void singletonFun() {
        System.out.println(name);
    }
}

public class SingletonLazyInitialization {
    public static void main(String args[]) {
        Singleton singleton = Singleton.getInstance();
        singleton.singletonFun();
    }
}
