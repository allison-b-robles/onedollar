package edu.moorparkcollege.onedollar;

import java.util.Scanner;

/**
 *
 * @author allisobernalx
 */
public class OneDollar {

    public static void main(String[] args) {
        
        /* Declare Variables */
        double PENNY = .01;
        double NICKEL = .05;
        double DIME = .10;
        double QUARTER = .25;      
        double total;
        String message;
        
        /* Initialize Scanner Class */
        Scanner money = new Scanner(System.in);
        
        /* Enter the amount pennies */
        System.out.print("Enter number of pennies: ");
        /* Save amount of pennies */
        double pennies = money.nextInt();
        pennies = pennies * PENNY; 
        
        /* Enter the amount nickels */
        System.out.print("Enter number of nickels: ");
        /* Save amount of nickels */
        double nickels = money.nextInt();
        nickels = nickels * NICKEL;
        
        /* Enter the amount dimes */
        System.out.print("Enter number of dimes: ");
        /* Save amount of dimes */
        double dimes = money.nextInt();
        dimes = dimes * DIME;
        
        /* Enter the amount quarters */
        System.out.print("Enter number of quarters: ");
        /* Save amount of quarters */
        double quarters = money.nextInt();
        quarters = quarters * QUARTER;
        
        /* Add all coins */
        total = pennies + nickels + dimes + quarters;
        
        if (total == 1.00) {
            message = "You won! Total amount entered equals a 1 dollar.";
            System.out.print(message);
        } else {
            message = "You lost. Try again.";
            if (total > 1.00){
                message += "The total entered is greater than 1 dollar.";
            } else {
                message += "The total entered is less than 1 dollar.";
            }
            System.out.print(message);
        }
    }
}
