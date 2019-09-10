package com.kodcu.question18;


import java.util.Arrays;

/*
TODO
 1 - Add String value to the Stack
 2 - Try to convert String value to uppercase
 3 - What is the lesson  ?
*/

public class Stack<E>  {

    //private E[] elements;
    private Object[] elements;

    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

     public Stack() {
             elements = new Object[DEFAULT_INITIAL_CAPACITY];
     }


   public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }
    public E pop() {
        if (size == 0)
            throw new EmptyStackException();
        @SuppressWarnings("unchecked") E result = (E) elements[--size];
        elements[size] = null; // Eliminate obsolete reference
        return result;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    public static void main(String[] args) {
            Stack<String> stack = new Stack<>();
            for (String arg : args)
                stack.push(arg);
            while (!stack.isEmpty()) {

                String value = stack.pop();
                System.out.println(value.toUpperCase());
            }
        }


}
