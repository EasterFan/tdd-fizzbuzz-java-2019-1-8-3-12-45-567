package com.thoughtworks.tdd;

import java.util.Scanner;

public class Main {
    private static Integer THREE = 3;
    private static Integer FIVE = 5;
    private static Integer SEVEN = 7;

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Integer input = in.nextInt();
        getResult(input);
    }

    public  static String getResult(Integer input){
        if (input.toString().contains(THREE.toString()) || input.toString().contains(FIVE.toString())
                || input.toString().contains(SEVEN.toString()) )  return getContainDigital(input);

        if (isMuiltpleOfThree(input) || isMuiltpleOfFive(input) || isMuiltpleOfSeven(input)){
            if (isMuiltpleOfThree(input) && isMuiltpleOfFive(input) && isMuiltpleOfSeven(input)) return FIZZ + BUZZ + WHIZZ;
            if (isMuiltpleOfThree(input) && isMuiltpleOfFive(input)) return FIZZ + BUZZ;
            if (isMuiltpleOfFive(input) && isMuiltpleOfSeven(input)) return BUZZ + WHIZZ;
            if (isMuiltpleOfThree(input) && isMuiltpleOfSeven(input)) return FIZZ + WHIZZ;
            if (isMuiltpleOfThree(input)) return FIZZ;
            if (isMuiltpleOfFive(input)) return BUZZ;
            if (isMuiltpleOfSeven(input)) return WHIZZ;
        }

        return "";

    }

    private static String getContainDigital(Integer input){
        if (input.toString().contains(THREE.toString())) return FIZZ;
        if (input.toString().contains(FIVE.toString())) return BUZZ;
        if (input.toString().contains(SEVEN.toString())) return WHIZZ;
        return "";
    }

    private static boolean isMuiltpleOfThree(Integer input){
        return input % THREE == 0;
    }

    private static boolean isMuiltpleOfFive(Integer input){
        return input % FIVE == 0;
    }

    private static boolean isMuiltpleOfSeven(Integer input){
        return input % SEVEN == 0;
    }
}
