import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner=new Scanner(System.in);
        String[] sArr=scanner.nextLine().split(" ");
        int len=sArr.length;
        int[] IntS=new int[len];
        for(int i=0;i<len;i++){
            IntS[i]=Integer.parseInt(sArr[i]);
        }
        int count=0;

        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-i-1;j++){
                if(IntS[j]<IntS[j+1]){
                    int temp=IntS[j+1];
                    IntS[j+1]=IntS[j];
                    IntS[j]=temp;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}