import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        int len=scanner.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=scanner.nextInt();
        }
        int length=1;
        int count=0;
        for(int i=0;i<len-1;i++){
            if(arr[i]-arr[i+1]==-1){
                length++;
                if(length==3){
                    count++;
                    length=2;
                }
            }else if(arr[i]-arr[i+1]!=-1){
                length=1;

            }
        }
        System.out.println(count);
    }
}