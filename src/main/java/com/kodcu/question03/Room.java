package com.kodcu.question03;


/**
 * Altug Bilgin Altintas
 * 
 * Effective Java Workshop
 * 
 * Email : altug@kodcu.com
 * Twitter : @altugaltintas
 */

public class Room {


    int numJunkPiles; // Number of junk piles in this room

    public Room(int numJunkPiles) {
        this.numJunkPiles = numJunkPiles;
    }


    @Override
    protected void finalize() throws Throwable {
        numJunkPiles = 0;
        System.out.println("numJunkPiles --> " + numJunkPiles);
    }
}
