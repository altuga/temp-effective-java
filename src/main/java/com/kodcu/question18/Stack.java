package com.kodcu.question18;


import java.util.Arrays;

/*
TODO
 1 - Add String value to the Stack
 2 - Try to convert String value to uppercase
 3 - What is the lesson  ?
*/

public class Stack<E> {
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;


    public Stack() {
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;

    }

    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }

        //Object result = elements[--size];
        E result = elements[--size];
        elements[size] = null;

        return result;
    }

    /**
     * Ensure space for at least one more element, roughly doubling the capacity
     * each time the array needs to grow.
     */
    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }


    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        stack.push("hello"); // write 12 and run again

        String result = (String) stack.pop();
        System.out.println(result.toUpperCase());

    }


}