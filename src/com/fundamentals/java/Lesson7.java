package com.fundamentals.java;
import java.util.Scanner;

/*
* The contents of this class goes over the Lesson 7 content
* Java Operators
* */
public class Lesson7 {
    int value1 = 23, value2 = 45;

    // This method goes over Basic Math
    public void basicMath() {
        int addTotal = value1 + value2;
        int subtractTotal = value2 - value1;
        int multiplyTotal = value1 * value2;
        int divideTotal = value2 / value1;

        System.out.println(addTotal);
        System.out.println(subtractTotal);
        System.out.println(multiplyTotal);
        System.out.println(divideTotal);
    } // end method basicMath

    // This method goes over Modulus
    public void exampleModulus() {
        int modulusTotal = value1 % value2;
        System.out.println(modulusTotal);
    } // end method exampleModulus

    // This method takes in numbers from the user and adds it.
    public void addTwoNumbers() {
        int x,y,z;
        System.out.println("Enter two integers to calculate their sum.");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x + y;
        System.out.println("The Sum of entered values = " +z);
    } // end method addTwoNumbers

    // This method covers Assignment Operators for basic math
    public void exampleAssignment() {
        int able = 10, may = 15;
        able += may;
        System.out.println(able);
        may -= able;
        System.out.println(may);
        able *= may;
        System.out.println(able);
        able /= may;
        System.out.println(able);
        may %= able;
        System.out.println(may);
    } // end method exampleAssignment

    /* The shift left operator will take the value as a primitive type
    * and convert it to the binary version. The binary is grouped in 4's, so
    * it will shift the binary version of the number to the left by the number
    * of spaces. The high-order bits outside the range of the result are discarded
    * and the remaining bits are shifted left, and the low-order empty bit positions
    * are set to zero. */
    public void exampleLeftShit() {
        // The number 15 converted to binary is = 1111
        int value = 15;
        // shifting value by 2 results in 0011 1100 which is 60
        value <<= 2;
        System.out.println(value);
    } // end method exampleLeftShift

    /* The right shift operator will take the value as a primitive type
    * and convert it to binary. The binary is grouped in 4's, so it will shift
    * the binary version of the number to the right by the number of spaces.
    * When the value of type is long or int, the lower-order bits of the value are
    * discarded, the remaining bits are shifted right, and the high-order empty bit
    * positions are set to zero.*/
    public void exampleRightShift() {
        // the number 30 in binary is 0001 1110
        int val = 30;
        // shifting the value by 2 results in 0111 = 7
        val >>= 2;
        System.out.println(val);
    } // end method exampleRightShift

    /* This AND bitwise compares the binary of both numbers. Only
    * the matched sets of 1's carry over... */
    public void exampleAND() {
        // The number 10 converted to binary is 1010
        int value = 10;
        // The number 2 converted to binary is 0010
        value &= 2; // answer is 2
        System.out.println(value);
    }

} // end class Lesson7
