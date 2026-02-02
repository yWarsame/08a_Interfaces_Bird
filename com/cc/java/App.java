package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Bird bird = new Bird();
        pollObj(bird);

    }

    private static void pollObj(Bird obj){
        output(obj.fly());
        output(obj.hasFeathers());
        output("-------------------");
    }


    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}


