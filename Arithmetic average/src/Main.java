import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double sum=0;
        double count=0;
        for(double i=a;i<=b;i++){
            if(i%3==0){
                sum+=i;
                count++;
            }
        }
        System.out.println(sum/count);
    }
}