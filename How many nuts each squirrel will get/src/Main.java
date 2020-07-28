import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int N=scanner.nextInt();
        int K=scanner.nextInt();

        if(K%N==0){
            System.out.println(K/N);
        }else{
            int rem=K%N;
            System.out.println((K-rem)/N);
        }
    }
}