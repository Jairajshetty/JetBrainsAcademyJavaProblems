import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        for(long i=1;i<=num;i++){
            long n=i;
            long res=1;
            while(n!=0){
                res=res*n;
                n--;
            }
            if(res>num){
                System.out.print(i);
                return;
            }

        }
    }
}