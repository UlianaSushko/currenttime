package com.company;
import java.io.*;

/**
 * Class that call methods for each object
 * to assign values to each variable
 */
public class Position_Values {

    public static void main(String args[]){
        Job_Position posOne = new Job_Position("Junior");
        Job_Position posTwo = new Job_Position("Middle");
        Job_Position posThree = new Job_Position("Senior");
        Job_Position posFour = new Job_Position("Lead");

        posOne.posCost(100);
        posOne.empProductivity(1);
        posOne.Job_Position();

        posTwo.posCost(200);
        posTwo.empProductivity(2);
        posTwo.Job_Position();

        posThree.posCost(300);
        posThree.empProductivity(3);
        posThree.Job_Position();

        posFour.posCost(400);
        posFour.empProductivity(4);
        posFour.Job_Position();
    }
}
