package com.DSA;

import java.util.EmptyStackException;

public interface Stack <E>{
        public void push (E e) throws FullStackException;
        public E pop () throws EmptyStackException, com.DSA.EmptyStackException;
        public int size();
    }

