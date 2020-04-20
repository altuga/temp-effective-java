package com.kodcu.question20;

import java.util.List;


/*
TODO
 1 - Compile Combiner.java
 2 - There are 1 warnings, can you spot the warning ?
 3 - try to fix this 1 warning.
*/
public class Hazardous {

     @SafeVarargs
      static <T> void hazardous( List<? extends T> ... stringLists) {

        List<Integer> intList = List.of(42);
        Object[] objects = stringLists;
        objects[0] = intList; // Heap pollution
      //  String s = stringLists[0].get(0); // ClassCastException
    }



    public static void main(String[] args) {
        hazardous(List.of("There be dragons!"));
    }
}