import java.util.Scanner;
import java.util.Stack;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter expression: ");
        String expression = scanner.nextLine();
        boolean isCorrect = true;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<expression.length(); i++) {
            char currentChar = expression.charAt(i);
            if(currentChar == '(' || currentChar == '[' || currentChar == '{') {
                stack.push(currentChar);
            } else if(currentChar == ')' || currentChar == ']' || currentChar == '}') {
                if(stack.isEmpty()) {
                    isCorrect = false;
                    break;
                } else {
                    char topChar = stack.peek();
                    if((currentChar == ')' && topChar == '(') ||
                       (currentChar == ']' && topChar == '[') ||
                       (currentChar == '}' && topChar == '{')) {
                        stack.pop();
                    } else {
                        isCorrect = false;
                        break;
                    }
                }
            }
        }
        
        if(!stack.isEmpty()) {
            isCorrect = false;
        }
        
        if(isCorrect) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
