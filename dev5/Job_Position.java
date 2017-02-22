package com.company;
import java.io.*;

/**
 * The class Job_Position has 3 assignment of variable position,
 * cost and productivety that takes a parameter.
 */
public class Job_Position {
    String position;
    double cost;
    int productivity;

    // Assignment of variable position
    public void job_position(String jobPosit){
        position = jobPosit;
    }
    //Assignment of variable cost
    public void job_cost(double jobCost){
        cost = jobCost;
    }
    //Assignment of variable productivity
    public void job_productivity(int jobProd){
        productivity = jobProd;
    }
    // Input information
    public void printJob_Position(){
        System.out.println("post:"+ position );
        System.out.println("salary:" + cost );
        System.out.println("efficiency:" + productivity );
    }
}
