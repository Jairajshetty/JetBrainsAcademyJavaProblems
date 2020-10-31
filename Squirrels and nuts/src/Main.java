import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int N=scanner.nextInt();
        int K = scanner.nextInt();
        System.out.println(K%N);
    }
}