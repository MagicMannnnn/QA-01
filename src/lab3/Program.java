package lab3;

import java.util.Scanner;

public class Program {
    static Utils utils = new Utils();


    public static void main(String[] args) {
        theLunchQueue();
    }

    private static void theLunchQueue(){
        String mainDish = utils.getString("What main dish would you like(Fish, Burgers or veg)?");
        int potatoes = utils.getInt("how many potatoes would you like?");
        int sprouts = utils.getInt("how many sprouts would you like?");
        System.out.printf("Your meal is %s with %d potatoes and %d sprouts.", mainDish, potatoes, sprouts);
    }
}
