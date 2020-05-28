import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr = new int[len];
        int smallest=100000;
        for(int i=0;i<len;i++){
            arr[i]=scanner.nextInt();
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println(smallest);

    }
}