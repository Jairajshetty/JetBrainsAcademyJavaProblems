import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();

        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(i==j){
                    System.out.print(0+" ");
                }else if(j==0){
                    System.out.print(i+" ");
                }else if(i==0){
                    System.out.print(j+" ");
                }else{
                    System.out.print(Math.abs(j-i)+" ");
                }
            }
            System.out.println();
        }

    }
}