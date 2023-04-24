package JavaBasics._16;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Take the code below and put it into a function, read the code and see what it is.
     * <p>
     * What do you think the function does? Name the function appropriately and make sure
     * <p>
     * return the appropriate result type
     *
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Put this into a function

        String convertionDescription = convertionCelsius(50.1);
    }
        private static String convertionCelsius (double celsius) {

            double fahrenheit = ((celsius * 9) / 5) + 32;
            String convertionDescription = celsius + " Celsius is " + fahrenheit + " fahrenheit";
            // End
            System.out.println(convertionDescription);
            return convertionDescription;
        }






    /**
     * 2: Create a function that processes and prints out all the names in the ArrayList
     *
     *    Make sure to put all the formatting code in the function, formatting:
     *    1) to Upper case
     *    2) Remove spaces at the start and the end
     *    3) If the name contains any numbers, instead of returning the name, return "Invalid"
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        List<String> names = Arrays.asList("Alan   ", "Alice   ", "Ant0ni0   ", "  Aziz");
        List<String> numbers = Arrays.asList("1,2,3,4,5,6,7,8,9,0");
        for (String name : names) {
            if (names.equals(numbers)) {
                System.out.println("invalid");
            }else
            System.out.println(name.toUpperCase().trim());
            }

        // Call your function
        }


    /**
     * 3: Write a function that prints out every variable seen in the code. It should not return anything
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        double myLunchPrice = 5.99;
        String lunchType = "sandwich";
        String description = "Nice big sandwich";
        int weightInGrams = 500;

        // Call your function
        }
        void printEveryVariables (){
            double myLunchPrice = 5.99;
            String lunchType = "sandwich";
            String description = "Nice big sandwich";
            int weightInGrams = 500;

        System.out.println(myLunchPrice + lunchType + description + weightInGrams);
        }
    }

