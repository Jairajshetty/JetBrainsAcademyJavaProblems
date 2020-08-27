import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        int count=0;
        int num=scanner.nextInt();
        int start=1;
        boolean truth=true;
        while (truth){
            for(int i=0;i<start;i++){
                if(count<num){
                    System.out.print(start+" ");
                    count++;
                }else{
                    truth=false;
                }
            }
            start++;
        }
    }
}