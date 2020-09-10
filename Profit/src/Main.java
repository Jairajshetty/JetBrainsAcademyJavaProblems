import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner=new Scanner(System.in);
        int M = scanner.nextInt();
        int P = scanner.nextInt();
        int K = scanner.nextInt();
        double t=M;
        int count=0;
        boolean truth = true;
        if(K==M){
            System.out.println(0);
        }else{
            while(truth){
                t=t+(t*P)/100;
                count++;
                if(t>=K){
                    truth=false;
                }
            }

            System.out.println(count);
        }



    }
}