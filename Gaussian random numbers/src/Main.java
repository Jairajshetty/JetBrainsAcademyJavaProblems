import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here

        int K =scanner.nextInt();
        double N =scanner.nextDouble();
        double M =scanner.nextDouble();

        int Kcopy=K;
        boolean truth=true;
        while(truth){
            int count=0;
            Random random=new Random((long) Kcopy);
            for(int i=0;i<N;i++){
                double rN=random.nextGaussian();
                if(rN<=M){
                    count++;
                }
            }
            if(count==N){
                System.out.println(Kcopy);
                truth=false;
            }
            Kcopy++;
        }



    }
}