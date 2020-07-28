import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int numOfBench=0;
        if(a%2==0){
            numOfBench+=a/2;
        }else{
            numOfBench+=((a-1)/2)+1;
        }
        if(b%2==0){
            numOfBench+=b/2;
        }else{
            numOfBench+=((b-1)/2)+1;
        }
        if(c%2==0){
            numOfBench+=c/2;
        }else{
            numOfBench+=((c-1)/2)+1;
        }
        System.out.println(numOfBench);
    }
}