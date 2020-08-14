package com.kodcu.question03;

/**
 * Altug Bilgin Altintas
 * 
 * Effective Java Workshop
 * 
 * Email : altug@kodcu.com
 * Twitter : @altugaltintas
 */


/*
TODO:
 1 - Story : Let’s assume that rooms must be cleaned before they are reclaimed.
 2 - How do you clean the Room - Create Room and clean numJunkPiles - 5 mins
 3 - Instructor will show the solutions
 4 - Refactor and ask questions 
*/

public class Adult {
    public static void main(String[] args) throws Exception {

        Room room = new Room(10);
        room = null ;
        System.gc();
        Thread.sleep(1000);
        System.gc();
        //Clean the room automagically
        System.out.println(room ); // clean numJunkPiles to zero


    }
}
