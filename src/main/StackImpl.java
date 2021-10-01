package main;

public class StackImpl <E> implements Stack<E>{
    E[] data;
    private int p;
    public StackImpl(int len){

        data=(E[])new Object[len];
    }
    public boolean Empty() {
        return p == 0;
    }
    public boolean Full(){
        return p >= data.length;
    }
    @Override
    public void push(E e) throws FullStackException{
        if (Full()) throw new FullStackException("Full");
        this.data[this.p++] = e;
    }

    @Override
    public void pop() throws EmptyStackException {
        if (Empty()) throw new EmptyStackException("Empty");
        E out = data[0];
        for (int i = 0; i< p-1; i++){
            data[i]=data[i+1];
        }
        data[p-1]=null;
        p--;

    }

    @Override
    public int size() {
        return this.p;
    }
}
