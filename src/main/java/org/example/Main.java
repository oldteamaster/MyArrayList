package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MyArrayList arrLst = new MyArrayList();
        arrLst.add("1");
        arrLst.add("two");
        arrLst.add("|||");
        arrLst.add("****");
        arrLst.add("V");
        arrLst.remove(3);
        arrLst.clear();
        arrLst.add("Сто");
        arrLst.add("1");
        arrLst.add("two");
        arrLst.add("|||");
        arrLst.add("****");
        arrLst.add("V");
        System.out.println("Розмір колекції: " + arrLst.size() + " елементів.");
        System.out.println("Елемент - " + arrLst.get(3));
    }

}