import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();

        if(h<a){
            System.out.print("Deficiency");
        }else if(h>=a&&h<=b){
            System.out.print("Normal");
        }else{
            System.out.print("Excess");
        }

    }
}