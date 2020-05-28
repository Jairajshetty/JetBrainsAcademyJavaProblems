import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str= scanner.nextLine();
        int strLen=str.split(" ").length;
        int[] arr =new int[strLen];
        for(int i=0;i<strLen;i++){
            arr[i]=Integer.parseInt(str.split(" ")[i]);
        }
        int rotation = scanner.nextInt();
        int ActualRot=rotation%strLen;
        for(int i=strLen-ActualRot;i<strLen;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<strLen-ActualRot;i++){
            System.out.print(arr[i]+" ");
        }
    }
}