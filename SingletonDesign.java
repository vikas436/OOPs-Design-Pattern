package com.designpattern;

class Singleton {
    private String name = "singleton";

    static class SingletonInstance {
        private static final Singleton instance = new Singleton();
    }
    private Singleton(){}

    public static Singleton getInstance() {
        return SingletonInstance.instance;
    }

    public void singletonFun() {
        System.out.println(name);
    }
}

public class SingletonDesign {
    public static void main(String args[]) {
        Singleton singleton = Singleton.getInstance();
        singleton.singletonFun();
    }
}
