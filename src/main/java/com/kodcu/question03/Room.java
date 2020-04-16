package com.kodcu.question03;


/**
 * Altug Bilgin Altintas
 * 
 * Effective Java Workshop
 * 
 * Email : altug@kodcu.com
 * Twitter : @altugaltintas
 */

public class Room implements  AutoCloseable{


    int numJunkPiles; // Number of junk piles in this room

    public Room(int numJunkPiles) {
        this.numJunkPiles = numJunkPiles;
    }


    @Override
    public void close()  {
        this.numJunkPiles = 0 ; // temizlendi
        System.out.println(" Cleaning  is done  " + this.numJunkPiles);
    }
}
