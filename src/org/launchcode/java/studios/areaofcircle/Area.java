package org.launchcode.java.studios.areaofcircle;

//this task is asking us for three things:
//1. ask the user for the radius
//2. calculate the area
//3. print the result (aka the area) to the screen

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Area area = new Area();
        area.calculateArea();
    }
    //declare class variables here


    //create constructor here
    public Area() {

    }

    //create other methods here
    public void calculateArea() {
        Scanner input = new Scanner(System.in);
        try {
            boolean keepOnLooping = true;
            while(keepOnLooping) {
                Double myUsersRadius = input.nextDouble();

                //checking if the input is a negative number
                if (myUsersRadius < 0) {
                    //print error to user
                    System.out.println("You cannot enter a negative number!");
                    //re-prompt the user
                } else {
                    //continue as normal
                    //calculate the area
                    //Area = pi * radius * radius
                    Double area = Circle.getArea(myUsersRadius);

                    //print the result
                    System.out.println(area);

                    //tell the while loop to exit
                    keepOnLooping = false;
                }
            }
        } catch (Exception error) {
            System.out.println("You must provide a numeric input!");
        }
        input.close();
    }
}

