// Assignment2 - Consecutive

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter numbers: ");
        String[] numbers = scanner.nextLine().split(" ");

        boolean consecutive = true;
        int previousNum = Integer.parseInt(numbers[0]);
        for (int i=1; i<numbers.length; i++) {
            int currentNum = Integer.parseInt(numbers[i]);

            if (currentNum != previousNum+1 && currentNum-1 != previousNum-2) {
                consecutive = false;
                System.out.println("currentNum : " + currentNum);
                System.out.println("previousNum : " + previousNum);
                System.out.println("Numbers is not consecutive.");
                break;
            }
            previousNum = currentNum;
        }

        if (consecutive) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
