import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=scanner.nextInt();
        }
        int large=arr[0];
        for(int i=0;i<len;i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        for(int i=0;i<len;i++){
            if(arr[i]==large){
                System.out.println(i);
                return;
            }
        }
    }
}