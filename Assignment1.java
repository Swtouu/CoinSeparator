// Assignment1 - Coin Separator

import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input amount of money : ");
        
        int moneyInput = scanner.nextInt();
        int[] notes = { 1000, 500, 100, 50, 20 };
        int[] coins = { 10, 5, 2, 1 };
        int[] noteCount = new int[notes.length];
        int[] coinCount = new int[coins.length];
        
        for (int i=0; i<notes.length; i++) {
            if (moneyInput >= notes[i]) {
                noteCount[i] = moneyInput/notes[i];
                moneyInput = moneyInput%notes[i];
            }
        }
        
        for (int i=0; i<coins.length; i++) {
            if (moneyInput >= coins[i]) {
                coinCount[i] = moneyInput/coins[i];
                moneyInput = moneyInput%coins[i];
            }
        }
        
        for (int i=0; i<notes.length; i++) {
            if (noteCount[i] > 0) {
                System.out.println("Note value: " + notes[i] + " total amount is " + noteCount[i]);
            }
        }
        
        for (int i=0; i<coins.length; i++) {
            if (coinCount[i] > 0) {
                System.out.println("Coin value: " + coins[i] + " total amount is " + coinCount[i]);
            }
        }
    }
}