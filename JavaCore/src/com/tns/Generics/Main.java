package com.tns.Generics;

public class Main {
    public static void main(String[] args) {
        
        IContainer<Integer> intList = new MyList<>(5);
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.displayContents();
    }
}






