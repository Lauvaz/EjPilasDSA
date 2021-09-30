package com.DSA;



public interface Stack <E>{
        public void push (E e) throws FullStackException;
        public void pop () throws EmptyStackException;
        public int size();
    }

