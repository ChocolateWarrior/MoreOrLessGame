package com.company.Model;

import java.util.ArrayList;
import java.util.Random;
public class Model implements Globals {

    private int gameNumber;
    private ArrayList <Integer> attemptArray = new ArrayList<>();
    private int floorNumber;
    private int ceilingNumber;

    public Model(){
        this.gameNumber = -1;
        this.floorNumber = 0;
        this.ceilingNumber = 100;
    }

    public void setRandomGameNumber(){
        Random rand= new Random();
        gameNumber = rand.nextInt(RAND_MAX) + 1;
    }

    public void addAttempt(int attempt){
        this.attemptArray.add(attempt);
    }

    public void setFloorNumber(int floor){
        this.floorNumber = floor;
    }
    public void setCeilingNumber(int ceiling){
        this.ceilingNumber = ceiling;
    }

    public int getGameNumber(){
        return this.gameNumber;
    }

    public int getFloorNumber(){
        return this.floorNumber;
    }

    public int getCeilingNumber(){
        return this.ceilingNumber;
    }

    public ArrayList getAttemptArray(){
        return this.attemptArray;
    }



}
