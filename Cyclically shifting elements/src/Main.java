import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int len = scanner.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<len;i++){
            if(i==0){
                System.out.print(arr[len-1]+" ");
            }else {
                System.out.print(arr[i-1]+" ");
            }
        }
    }
}