package com.tns.Generics;

public class MyList<T> implements IContainer<T> {
    private Object[] items;
    private int size;

    public MyList(int capacity) {
        items = new Object[capacity];
        size = 0;
    }

    @Override
    public void add(T item) {
        if (size < items.length) {
            items[size] = item;
            size++;
        } else {
            System.out.println("The list is full. Cannot add more items.");
        }
    }

    @Override
    public void displayContents() {
        System.out.println("List Contents:");
        for (int i = 0; i < size; i++) {
            System.out.println(items[i]);
        }
    }
}