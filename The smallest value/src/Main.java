import java.math.BigInteger;
import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        BigInteger M=scanner.nextBigInteger();
        BigInteger res=BigInteger.valueOf(1);
        for(int i=1;i<1000;i++){
            res=res.multiply(BigInteger.valueOf(i));
            if(res.compareTo(M)>=0){
                System.out.println(i);
                break;
            }
        }
    }
}