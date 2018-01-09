package im.fenqi.study.chapter11.part05.stack;

import java.util.LinkedList;

/*
 * 11.8、栈的实现
 * */
public class Stack<AnyType> {
    private LinkedList<AnyType> storage = new LinkedList<>();
    public void push(AnyType x){
        storage.addFirst(x);
    }
    public AnyType peek(){
        return storage.getFirst();
    }
    public AnyType pop(){
        return storage.removeFirst();
    }
    public boolean isEmpty(){
        return storage.isEmpty();
    }

    @Override
    public String toString() {
        return storage.toString();
    }
}