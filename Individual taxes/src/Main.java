import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner=new Scanner(System.in);
        int len=scanner.nextInt();
        int[] income=new int[len];
        int[] percent=new int[len];
        int[] taxes = new int[len];
        for(int i=0;i<len;i++){
            income[i]=scanner.nextInt();
        }
        for(int i=0;i<len;i++){
            percent[i]=scanner.nextInt();
        }
        for(int i=0;i<len;i++){
            taxes[i]=income[i]*percent[i];
        }
        int currentTax=taxes[0];
        int currentIndex=0;
        for(int i=1;i<len;i++){
            if(taxes[i]>currentTax){
                currentTax=taxes[i];
                currentIndex=i;
            }else if(taxes[i]==currentTax){
                if(income[i]<income[currentIndex]){
                    currentIndex=i;
                }
            }
        }
        System.out.println(currentIndex+1);
    }
}