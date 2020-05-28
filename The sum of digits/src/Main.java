import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num= scanner.nextInt();
        int first=num/100;
        int last = num%(num/10);
        int middle=(num/10)%(first*10);
        System.out.println(first+middle+last);

    }
}