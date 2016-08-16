/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aosorio.practice01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Array;

/**
 *
 * @author AOSORIO
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Foo f = new Foo();
        System.out.println(f.getClass().getName());

        Method method;

        try {
            method = f.getClass().getMethod("print", new Class<?>[0]);
            method.invoke(f);

        } catch (Exception e) {
            e.printStackTrace();
        }

        Class<?> c = null;

        try {
            c = Class.forName("com.aosorio.practice01.Foo");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Foo ff = null;

        try {
            ff = (Foo) c.newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }

        ff.print();

        Foo f1 = null;
        Foo f2 = null;

        Constructor<?> cons[] = c.getConstructors();
        System.out.println(cons.length);
        try {
            f1 = (Foo) cons[0].newInstance();
            f2 = (Foo) cons[1].newInstance("the second constructor");
        } catch (Exception e) {
            e.printStackTrace();
        }

        f1.print();
        f2.print();

        int[] intArray = {1, 2, 3, 4, 5};
        int[] newIntArray = (int[]) changeArraySize(intArray, 10);
        
        String[] atr = { "a", "b", "c", "d", "e" };
        String[] str1 = (String[]) changeArraySize(atr, 10);
        print(str1);

    }

    // change array size
    public static Object changeArraySize(Object obj, int len) {
        Class<?> arr = obj.getClass().getComponentType();
        Object newArray = Array.newInstance(arr, len);
        //do array copy
        int co = Array.getLength(obj);
        System.arraycopy(obj, 0, newArray, 0, co);
        return newArray;
    }

    // print
    public static void print(Object obj) {
        Class<?> c = obj.getClass();

        if (!c.isArray()) {
            return;
        }
        
        System.out.println("\nArray length: " + Array.getLength(obj));

        for (int i = 0; i < Array.getLength(obj); i++) {
            System.out.print(Array.get(obj, i) + " ");
        }
    }
    
}

class Foo {

    private String message = "";

    public Foo() {
    }

    public Foo(String s) {
        this.message = s;
    }

    public void print() {
        if (message.isEmpty()) {
            System.out.println("abc");
        } else {
            System.out.println(message);
        }
    }

    public void print(String pMessage) {
        System.out.println(pMessage);
    }

}
