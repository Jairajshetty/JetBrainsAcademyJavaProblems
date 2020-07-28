import java.util.*;
import java.math.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        int a1=scanner.nextInt();
        int a2=scanner.nextInt();
        int b1=scanner.nextInt();
        int b2=scanner.nextInt();

        double resA=Math.sqrt(Math.pow(a1,2)+Math.pow(a2,2));
        double resB=Math.sqrt(Math.pow(b1,2)+Math.pow(b2,2));

        double dotProd=a1*b1+a2*b2;

        double cosRes=dotProd/(resA*resB);

        System.out.print((Math.acos(cosRes)*180)/Math.PI);
    }
}