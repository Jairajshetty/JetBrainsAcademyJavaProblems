import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();

        int[][] arr=new int[num][num];
        int top=0;
        int left=0;
        int right=num-1;
        int bottom=num-1;
        int val=0;
        while(val<(num*num)){
            for(int i=left;i<=right;i++){
                arr[top][i]=val;
                val++;
            }
            top++;

            for(int i=top;i<=bottom;i++){
                arr[i][right]=val;
                val++;
            }
            right--;

            for(int i=right;i>=left;i--){
                arr[bottom][i]=val;
                val++;
            }
            bottom--;

            for(int i=bottom;i>=top;i--){
                arr[i][left]=val;
                val++;
            }
            left++;

        }

        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                System.out.print((arr[i][j]+1)+" ");
            }
            System.out.println();
        }
    }
}