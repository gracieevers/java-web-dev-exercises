package exercises;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {
        //what data types should the dimensions be?
        AreaOfRectangle areaOfRectangle = new AreaOfRectangle();
        areaOfRectangle.calculateAreaOfRectangle();
    }

    public void calculateAreaOfRectangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the length of the rectangle?");
        Double myRectangleLength = scanner.nextDouble();

        System.out.println("What is the width of the rectangle?");
        Double myRectangleWidth = scanner.nextDouble();

        //area = width x length
        Double area = myRectangleLength * myRectangleWidth;

        System.out.println("Your area is: " + area.toString());
    }
}
