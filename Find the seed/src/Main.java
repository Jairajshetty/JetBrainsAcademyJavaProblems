import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        String[] arr= scanner.nextLine().split(" ");
        int A=Integer.parseInt(arr[0]);
        int B=Integer.parseInt(arr[1]);
        int N=Integer.parseInt(arr[2]);
        int K=Integer.parseInt(arr[3]);

        int[] maxArr=new int[B-A+1];
        int[] maxSeed=new int[B-A+1];


        for(int i=A;i<=B;i++){
            Random random=new Random(i);
            int max=0;
            int[] temp=new int[N];
            for(int j=0;j<N;j++){
                temp[j]=random.nextInt(K);
            }
            for(int k=0;k<N;k++){
                if(temp[k]>max){
                    max=temp[k];
                }
            }
            maxArr[i-A]=max;
            maxSeed[i-A]=i;
        }
        int res=maxArr[0];
        int ind=0;
        for(int i=0;i<B-A+1;i++){
            if(maxArr[i]<res){
                res=maxArr[i];
                ind=maxSeed[i];
            }
        }
        System.out.println(ind);
        System.out.println(res);


    }
}