import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len=scanner.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m= scanner.nextInt();
        int indexOfn=-1;

        for(int i=0;i<len;i++){
            if(arr[i]==n){
                indexOfn=i;
            }
        }
        if(indexOfn==-1){
            System.out.println(false);
        }else if(indexOfn==len-1){
            if(arr[indexOfn-1]==m){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }else if(indexOfn==0){
            if(arr[indexOfn+1]==m){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }else{
            if(arr[indexOfn+1]==m||arr[indexOfn-1]==m){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }
    }
}