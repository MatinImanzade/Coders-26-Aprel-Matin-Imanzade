package az.coders.lesson14;

import java.util.ArrayList;
import java.util.List;

public class Stack <T>{
    private List<T> stackElements = new ArrayList<>();

    public void push(T t){
        stackElements.add(t);
    }

    public T pop (List<T> stackElements){
        T t =  stackElements.get(0);
        return t;
    }

    public boolean isEmpty(List<T> stackElements){
        boolean b = true;

        for (T t: stackElements) {

        }

        return b;
    }
}

class Main{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);

    }
}
