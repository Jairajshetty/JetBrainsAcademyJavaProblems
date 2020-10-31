// Don't delete this import statement
import java.util.Scanner;

class SimpleCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        String operator = scanner.next();
        long num2 = scanner.nextLong();

        switch (operator){
            case "-":subtractTwoNumbers(num1,num2);
            break;
            case "+":sumTwoNumbers(num1,num2);
            break;
            case "/":divideTwoNumbers(num1,num2);
            break;
            case "*":multiplyTwoNumbers(num1,num2);
            break;
            default:break;
        }

    }

    // Implement your methods here
    public static void subtractTwoNumbers(long a,long b){
        System.out.println(a-b);
    }


    public static void sumTwoNumbers(long a,long b){
        System.out.println(a+b);
    }


    public static void divideTwoNumbers(long a ,long b){
        if(b==0){
            System.out.println("Division by 0!");
        }else{
            System.out.println(a/b);
        }
    }


    public static void multiplyTwoNumbers(long a,long b){
        System.out.println(a*b);
    }
}