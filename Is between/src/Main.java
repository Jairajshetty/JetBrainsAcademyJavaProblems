import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a =scanner.nextInt();
        int b =scanner.nextInt();
        int c =scanner.nextInt();


        if(a>=b){
            if(a<=c){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }else if(a>=c){
            if(a<=b){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }else{
            System.out.println("false");
        }
    }
}