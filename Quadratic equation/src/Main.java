import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        double a =scanner.nextDouble();
        double b =scanner.nextDouble();
        double c =scanner.nextDouble();

        double res1=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
        double res2=(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);

        System.out.println(Math.min(res1,res2)+" "+Math.max(res1,res2));
    }
}