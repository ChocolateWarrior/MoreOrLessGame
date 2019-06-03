package com.company.View;

public class View {

    public static final String DOT = ".";
    public static final String LEFT_SQUARE_BRAKES = "[";
    public static final String RIGHT_SQUARE_BRAKES_SPACE = "] ";
    public static final String TO = " to ";
    public static final String ATTEMPTS = " attempts.";
    public static final String STATISTICS = "Statistics:";
    public static final String YOU_GUESSED_IN = "You guessed the number in ";
    public static final String YOU_HAVE_ALREADY_TRIED = "You've already tried ";
    public static final String YOUR_ATTEMPTS = "Your attempts: ";
    public static final String NUMBER_TOO_SMALL = "Your number is too small. Try higher number.";
    public static final String NUMBER_TOO_BIG = "Your number is too big. Try smaller number.";
    public static final String YOUR_RANGE_IS_NEXT = "Your range is next: from ";
    public static final String INCORRECT_INPUT = "Incorrect input! Try again:";
    public static final String NAN_INPUT = "Not a number in input! Try again:";
    public static final String NUMBER_OUT_OF_RANGE = "Number out of range: ";
    public static final String TRY_ANOTHER_NUMBER = ". Try another number.";
    public static final String GAME_STARTED = "The game started! The aim is to guess" +
            " the number from 0 to 100. Type your number to guess: ";
    public static final String CONGRATULATIONS = "Congratulations! Your number is ";


    public void viewMessage(String msg){ System.out.println(msg); }
    public void viewAttempt(String msg){
        System.out.print(msg);
    }
    public void viewEmptyLine() { System.out.println();}


}
