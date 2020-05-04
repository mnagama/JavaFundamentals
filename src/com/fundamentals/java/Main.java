package com.fundamentals.java;

/* This class was created when the project
* was created */
public class Main {

    public static void main(String[] args) {
        lesson7Examples();
        //  lesson6Examples();
        // lesson5Examples();
	// write your code here
       //System.out.println("Hello Java");
       //System.out.println("This is my first sentence");
       //System.out.println("I am new to Java");
       //System.out.println("This Java course is cool");
       //System.out.println("I am learning stuff every day");

       //myHouseExample();
    } // End main method

    public static void lesson7Examples() {
        Lesson7 mySeven = new Lesson7();
        mySeven.basicMath();
        mySeven.exampleModulus();
        //mySeven.addTwoNumbers();
        mySeven.exampleAssignment();
    } // end method lesson7Examples

    public static void lesson6Examples() {
        Lesson6 mySix = new Lesson6();
        mySix.exampleCharAt();
        mySix.exampleConcat(" has awesome donuts");
        mySix.exampleEquals("LaMars");
        System.out.println(mySix.exampleLowercase());
        System.out.println(mySix.exampleUppercase());
        mySix.exampleLength();
        mySix.exampleBuilder("Spaghetti", 2);
        mySix.exampleChar();
        mySix.exampleEscape();
    } // end method lesson6Examples

    public static void lesson5Examples() {
        Lesson5 myFive = new Lesson5();
        myFive.showLocalExample();
        int example = myFive.showLocalWithReturn(5,7); // return to a variable
        System.out.println(example); // print variable from line above
        System.out.println(myFive.showLocalWithReturn(2,9)); // direct return of int
        myFive.showInstanceVariable();
        myFive.showConversions();
    } // end method lesson5Examples

    public static void myHouseExample() {
        House myHouse = new House();
        myHouse.doorOpenClose();
    } // End myHouseExample
} // end class Main
