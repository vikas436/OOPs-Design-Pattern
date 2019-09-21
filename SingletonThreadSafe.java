package com.designpattern;

class Singleton {
    private static Singleton singleton = null;
    private String name = "singleton";

    private Singleton(){}

    public synchronized static Singleton getInstance() {
        if(singleton==null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public void singletonFun() {
        System.out.println(name);
    }
}

public class SingletonThreadSafe {
    public static void main(String args[]) {
        Singleton singleton = Singleton.getInstance();
        singleton.singletonFun();
    }
}
