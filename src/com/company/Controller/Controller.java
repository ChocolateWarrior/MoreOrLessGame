package com.company.Controller;

import com.company.ConsoleInput.ConsoleInput;
import com.company.Model.Model;
import com.company.View.View;

import java.util.InputMismatchException;

//TODO Make Instance DONE
//TODO Make methods rather than startGame()-method DONE
//TODO Put range-constants into separate interface as final fields DONE
//TODO JUnit
//TODO Initialize with GIT
//TODO Initialize with Maven


public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    private  void displayRange(){
        view.viewMessage(View.YOUR_RANGE_IS_NEXT + model.getFloorNumber() + View.TO + model.getCeilingNumber());
    }

    private void displayAttemptNumber(){
        view.viewMessage(View.YOU_GUESSED_IN + model.getAttemptArray().size() + View.ATTEMPTS);
    }

    private void displayAttempts(){
        view.viewAttempt(View.YOUR_ATTEMPTS);
        for(Object attempt : model.getAttemptArray()){
            view.viewAttempt(View.LEFT_SQUARE_BRAKES + attempt + View.RIGHT_SQUARE_BRAKES_SPACE);
        }
        view.viewEmptyLine();
    }

    private boolean isDuplicate(int numberToCheck){
        return model.getAttemptArray().contains(numberToCheck);
    }

    private boolean isInRange(int numberToCheck){
        return (numberToCheck <= 100) && (numberToCheck >= 0);

    }

    private void checkForRange(int userNumber){
        if (!isInRange(userNumber)) {
            view.viewMessage(View.NUMBER_OUT_OF_RANGE +
                    userNumber + View.TRY_ANOTHER_NUMBER);
            displayAttempts();
        }
    }
    private void checkForDuplication(int userNumber){
        if (isDuplicate(userNumber)) {
            view.viewMessage(View.YOU_HAVE_ALREADY_TRIED +
                    userNumber + View.TRY_ANOTHER_NUMBER);
            displayAttempts();
        }
    }
    private void checkIfTooSmall(int userNumber){
        if (userNumber < model.getGameNumber() && userNumber > model.getFloorNumber()) {
            model.setFloorNumber(userNumber);
            view.viewMessage(View.NUMBER_TOO_SMALL);
            model.addAttempt(userNumber);

            displayAttempts();
        }
    }
    private void checkIfTooBig(int userNumber){
        if (userNumber > model.getGameNumber() && userNumber < model.getCeilingNumber()) {
            model.setCeilingNumber(userNumber);
            view.viewMessage(View.NUMBER_TOO_BIG);
            model.addAttempt(userNumber);

            displayAttempts();
        }
    }

    private boolean checkForSuccess(int userNumber){
        if(userNumber == model.getGameNumber()){
            view.viewMessage(View.CONGRATULATIONS + model.getGameNumber() + View.DOT);
            view.viewMessage(View.STATISTICS);
            displayAttemptNumber();
            displayAttempts();
            return true;
        }else return false;
    }


    public void startGame(){

        model.setRandomGameNumber();
        model.setCeilingNumber(100);
        model.setFloorNumber(0);
        int userNumber;
        ConsoleInput scanner = new ConsoleInput();
        view.viewMessage(View.GAME_STARTED);

        boolean success = false;
        while (!success){
            try {
                userNumber = scanner.getUserNumber();
                checkForRange(userNumber);
                checkForDuplication(userNumber);
                checkIfTooSmall(userNumber);
                checkIfTooBig(userNumber);
                success = checkForSuccess(userNumber);
                displayRange();
            }catch (NumberFormatException e){
                scanner.nextLine();
                view.viewMessage(View.INCORRECT_INPUT);
            }catch (InputMismatchException e){
                scanner.nextLine();
                view.viewMessage(View.NAN_INPUT);
            }

        }

    }




}
