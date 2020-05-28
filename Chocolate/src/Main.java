import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

       if((n*m)<=k){
           System.out.print("NO");
       }else if(k%m==0||k%n==0){
           System.out.print("YES");
       }else{
           System.out.print("NO");
       }
    }
}