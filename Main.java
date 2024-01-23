// Programmers: Bonita Rodrigues
// Course:  CS 212, Dr.Nweke
// Due Date: 1/23/24
// Lab Assignment: Lab from 151
// Problem Statement: Find the new population size of a given country using birth rate, death rate and, immigration rates
// Input: current population size; seconds between births, deaths, and new immigration; years of obervation
// Output: A statement including the new population size after a given amount of years
// Credits: none

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // Starting statements
        System.out.println("This program will give an estimate of the population size of a given country over a given period of time.");

        Scanner input = new Scanner(System.in);
        // Gets basic information (current population, birth, death, immigration, time obsereved)
        // from the user and sets them to variables
        System.out.println("What is the current population size of your country?");
        int popSize = input.nextInt();
        System.out.println("How many seconds between each birth in your country?");
        double birthTime = input.nextDouble();
        System.out.println("How many seconds between each death in your country?");
        double deathTime = input.nextDouble();
        System.out.println("How many seconds between each new immigrant entering your country?");
        double immTime = input.nextDouble();
        System.out.println("How many years of change do you want to observe?");
        int years = input.nextInt();
        // Given seconds in year
        int secondsInYear = 31536000;

        // Calculates how many births have occured in given years
        double newBirths = (years*secondsInYear)/birthTime;
        // Calculates how many deaths have occured in given years
        double newDeaths = (years*secondsInYear)/deathTime;
        // Calculates how many immigrants have entered the country in given years
        double newImms = (years*secondsInYear)/immTime;
        // Calculates the new population
        int futurePop = (int)(popSize + newBirths + newImms - newDeaths);

        //Ending Statements
        System.out.println("The population of your country in " + years + " years will be " + futurePop);
        System.out.println("Thank you for using our program!");
    }


}
