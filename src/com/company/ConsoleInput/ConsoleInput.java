package com.company.ConsoleInput;

import java.util.Scanner;

public class ConsoleInput {

    private Scanner scanner;

    public ConsoleInput() {
        this.scanner = new Scanner(System.in);
    }

    public  int getUserNumber() {
        return scanner.nextInt();
    }

    public String nextLine(){
        return scanner.nextLine();
    }
}
