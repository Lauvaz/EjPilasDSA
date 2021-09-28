package com.DSA;

import java.util.EmptyStackException;

public class Main {

    public static void main(String[] args) {
        System.out.println("TEST");
        Stack<Integer> s = new StackImpl<Integer>(5);
        try {
            s.push(5);
            System.out.println(s.size());
            s.push(12);
            System.out.println(s.size());

            Stack<String> s2 = new StackImpl<String>(3);
            s2.push("hola");
            System.out.println(s.size());
            s2.push("adeu");
            System.out.println(s.size());

            //s2.pop();
        } catch (EmptyStackException empty) {
            empty.printStackTrace();
            //
        } catch (FullStackException full) {
            full.printStackTrace();
            //
        } finally {
            //
        }
    }
}
