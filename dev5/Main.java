package com.company;

/**
 * The program selects employees by parameters of clients
 */
public class Main {

    public static void main(String[] args) {
        Position_Values values = new Position_Values();
        Job_Position printer =  new Job_Position();
        Results outputter = new Results();

        printer.print(printer.Job_Position());
    }
}
