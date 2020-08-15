package com.kodcu.question21;


/**
 * TODO
 * 1 - How to calculate your  weight on all eight planets  - 5 minutes
 * 2 - Instructor will show the solutions
 * 3 - What is the lesson  ?
 */
public class Main {

   public static void main(String[] args) {
         double earthWeight = Double.parseDouble("80");
         double mass = earthWeight / Planet.EARTH.surfaceGravity();
         for (Planet p : Planet.values())
            System.out.printf("Weight on %s is %f%n",
                    p, p.surfaceWeight(mass));
      }
}
