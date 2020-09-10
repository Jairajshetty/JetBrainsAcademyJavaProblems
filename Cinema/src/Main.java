import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String mn=scanner.nextLine();
        int n=Integer.parseInt(mn.split(" ")[0]);
        int m=Integer.parseInt(mn.split(" ")[1]);
        int[][] multiRows=new int[n][m];
        for(int i=0;i<n;i++){
            String next=scanner.nextLine();
            String[] temp=next.split(" ");
            int[] t=new int[m];
            for(int j=0;j<m;j++){
                t[j]=Integer.parseInt(temp[j]);
            }
            multiRows[i]=t;
        }


        int k=scanner.nextInt();
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(multiRows[i][j]==0){
                    count++;
                }
                if(count==k){
                    System.out.println(i+1);
                    return;
                }
                if(multiRows[i][j]!=0){
                    count=0;
                }
            }

        }
        System.out.println(0);

    }
}