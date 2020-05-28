import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len=scanner.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i]=scanner.nextInt();
        }
        int first=arr[0];
        boolean res=true;
        for(int i=1;i<len;i++){
            if(arr[i]<arr[i-1]){
                res=false;
                break;
            }
        }
        System.out.println(res);
    }
}