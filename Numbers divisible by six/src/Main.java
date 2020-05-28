import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum=0;
        for(int i=0;i<num;i++){
            int n= scanner.nextInt();
            if(n%6==0){
                sum+=n;
            }
        }
        System.out.print(sum);
    }
}