package lab2;

import java.util.Scanner;
import java.util.Set;

public class Airport {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        boolean running = true;

        while (running){
            System.out.print("Enter amount in newAmount to exchange: £");
            float gbp = (int)(sc.nextFloat() * 100) / 100.f; //2dp

            int choice = 0;
            while (!Set.of(1, 2, 3).contains(choice)){
                System.out.print("Choose a currency (1 for USD, 2 for EUR, 3 for JPY): ");
                choice = sc.nextInt();
            }

            String symbol = "";
            float newAmount = 0;
            switch (choice){
                case 1:
                    newAmount = (int)(gbp * 1.25f * 100.f) / 100.f;
                    symbol = "USD";
                    break;

                case 2:
                    newAmount = (int)(gbp * 1.15f * 100.f) / 100.f;
                    symbol = "EUR";
                    break;

                case 3:
                    newAmount = (int)(gbp * 180.50f * 100.f) / 100.f;
                    symbol = "JPY";
                    break;

                default:
                    break;
            }

            choice = 0;
            while (!Set.of(1, 2, 3).contains(choice)){
                System.out.print("Select Customer type (1 for Regular, 2 for VIP, 3 for STAFF): ");
                choice = sc.nextInt();
            }
            newAmount = newAmount < 100 ? newAmount * 0.95f : newAmount * 0.975f;
            newAmount = (int)(newAmount * 100.f) / 100.f;
            System.out.println("Amount after service fee: " + newAmount + " " + symbol);
            if (choice != 3) {
                newAmount = choice == 1 ? newAmount * 0.9f : newAmount * 0.95f;
                newAmount = (int)(newAmount * 100.f) / 100.f;
            }
            System.out.println("Amount after Tax: " + newAmount + " " + symbol);
            System.out.println("Final amount: " + (int)newAmount + " " + symbol);

            System.out.println("Again? (y/n): ");
            running = sc.nextLine().equals("y");
        }







    }
}
