import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int[] arr=new int[3];
        for(int i=0;i<3;i++){
            arr[i]=scanner.nextInt();
        }
        if(arr[0]+arr[1]==20||arr[1]+arr[2]==20||arr[0]+arr[2]==20){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
