package com.kodcu.question14;



/*
TODO
 1 - Calculate the area of a circle (A = π x r2 ) using PhysicalConstants.PI.
 2 - What is not good is that process ?
 3 - Instructor will show the solutions
 4 - Calculate the  energy (J) in 5 KG uranium  ?
     Formula = E = MxC^2
     C = speed of light (m/s) = 3.0x10^8 m/s
*/

public class AreaCalculator {



    public static void main(String[] args) {
        double value = 12;
        double aoC = PhysicalConstants.PI.getValue() * value;
        System.out.println(" Area of Circle = " + aoC );

        double kiloOfUranium = 5 ;
        double energy = kiloOfUranium * PhysicalConstants.C.getValue();
        System.out.println(" Energy = " + energy );

    }
}
