import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i]=scanner.nextInt();
        }
        int largest=0;
        int indexOfLargest=-1;
        for(int i=0;i<len;i++){
            if(arr[i]>largest){
                largest=arr[i];
                indexOfLargest=i;
            }
        }
        int secondToLargest=0;
        for(int i=0;i<len;i++){
            if(arr[i]>secondToLargest&&arr[i]<=largest&&i!=indexOfLargest){
                secondToLargest=arr[i];
            }
        }
        System.out.println(largest*secondToLargest);
    }
}