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
        int a=scanner.nextInt();
        for(int i=0;i<len;i++){
            if(arr[i]==a){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);

    }
}