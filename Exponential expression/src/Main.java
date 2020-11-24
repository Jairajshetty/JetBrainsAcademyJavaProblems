import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        Double in=scanner.nextDouble();
        Double res=1+in+Math.pow(in,2)+Math.pow(in,3);
        System.out.println(res);
    }
}