package exercises;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        ArrayPractice arrayPractice = new ArrayPractice();
        // arrayPractice.printOddNumbers();
        arrayPractice.printStringArray();
        arrayPractice.printStringArrayIntoSentences();
    }

    public void printOddNumbers() {

        int[] integerArray = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 == 1) {
                System.out.println(integerArray[i]);
            }
        }
    }

    public void printStringArray() {

        String stringArray = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] splitStringArray = stringArray.split(" ");
        System.out.println(Arrays.toString(splitStringArray));

    }

    public void printStringArrayIntoSentences() {

        String sentenceArray = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] splitSentenceArray = sentenceArray.split("\\.");
        System.out.println(Arrays.toString(splitSentenceArray));
    }
}