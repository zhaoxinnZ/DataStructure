package main.java.pers.xinn;
import java.util.Scanner;
import java.util.Stack;


public class PostfixToValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter the Postfix:\n");
        String str = scanner.next();
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)){
                stk.push(c - '0');
            }else {
                int pop1 = stk.pop();
                int pop2 = stk.pop();

                switch (c){
                    case '+':
                        stk.push(pop2 + pop1);
                        break;
                    case '-':
                        stk.push(pop2 - pop1);
                        break;
                    case '/':
                        stk.push(pop2 / pop1);
                        break;
                    case '*':
                        stk.push(pop2 * pop1);
                        break;
                }
            }
        }
        System.out.printf("The value of %s is : %d",str,stk.pop());
    }
}
