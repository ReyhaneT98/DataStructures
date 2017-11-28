package term3_12;

import java.util.Stack;
import java.util.Scanner;

class PostfixEvaluation {

    public static void main(String[] args) {
    	 Scanner input = new Scanner(System.in);
    	 
    	 System.out.printf("please enter the postfix string : ");
        String postfix =input.nextLine();
        Double value = evaluate(postfix);
        System.out.println(value);
    }

    
    
    public static Double evaluate(String postfix) {
        
    	Stack<Double> s = new Stack<Double>();

        
        char[] chars = postfix.toCharArray();

        int N = chars.length;

        for (int i = 0; i < N; i++) {
            char ch = chars[i];

            if (isOperator(ch)) {
                
            	
                switch (ch) {
                    case '+': s.push(s.pop() + s.pop());     break;
                    case '*': s.push(s.pop() * s.pop());     break;
                    case '-': s.push(-s.pop() + s.pop());    break;
                    case '/': s.push(1 / s.pop() * s.pop()); break;
                    case '^': s.push(Math.pow(s.pop(), s.pop())); break;
                }
            } else if(Character.isDigit(ch)) {
                
            	
                s.push(0.0);
                while (Character.isDigit(chars[i]))
                    s.push(10.0 * s.pop() + (chars[i++] - '0'));
            }
        }

        
        if (!s.isEmpty()) 
            return s.pop();
        else
            return 0.0;
    }

   
    private static boolean isOperator(char ch) {
        return ch == '^' || ch == '*' || ch == '/' || ch == '+' || ch == '-';
    }
}
