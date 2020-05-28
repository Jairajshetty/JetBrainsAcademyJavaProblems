import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h1=scanner.nextInt();
        int m1=scanner.nextInt();
        int s1=scanner.nextInt();
        int h2=scanner.nextInt();
        int m2=scanner.nextInt();
        int s2=scanner.nextInt();

        int seconds1= h1*60*60+m1*60+s1;
        int seconds2= h2*60*60+m2*60+s2;

        System.out.println(seconds2-seconds1);
    }
}