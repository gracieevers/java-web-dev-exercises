package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {
        // ArrayList<Integer> numberList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        // Integer theSum = ArrayListPractice.sumOfEvenNumbers(numberList);
        // System.out.println("The sum is: " + theSum.toString());

        ArrayPractice arrayPractice = new ArrayPractice();
        String[] returnedWords = arrayPractice.printStringArray();

        ArrayList<String> wordsArray = new ArrayList<String>(Arrays.asList(returnedWords));
        System.out.println("What is your word length: ");
        Integer searchLength = ArrayListPractice.getUsersInput();
        ArrayListPractice.printFiveLetterWords(wordsArray, searchLength);
    }
    //Modify your code to prompt the user to enter the word length for the search.
    public static Integer getUsersInput(){
        Scanner scanner = new Scanner(System.in);
        Integer usersInt = scanner.nextInt();
        scanner.close();
        return usersInt;
    }
    //Write a static method to print out each word in a list that has exactly 5 letters.
    public static void printFiveLetterWords(ArrayList<String> words, Integer searchLength){
        for(int i = 0; i < words.size(); i++) {
            if(words.get(i).length() == searchLength) {
            System.out.println(words.get(i));
            }
        }
    }

    // Write a static method to find the sum of all the even numbers in an ArrayList.
    // Within main, create a list with at least 10 integers and call your method on the list.
    public static Integer sumOfEvenNumbers(ArrayList<Integer> numberList) {
        Integer sum = 0;
        for (int i = 0; i < numberList.size(); i++){
            if(numberList.get(i) % 2 == 0) {
                sum += numberList.get(i);
            }
        }
        return sum;
    }
}
