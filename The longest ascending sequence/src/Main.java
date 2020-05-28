import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=scanner.nextInt();
        }
        int length=1;
        int previousLength=1;
        if(arr.length==1){
            System.out.println(1);
        }else{
                for (int i=1;i<len;i++){
                    if(arr[i]>arr[i-1]){
                        length+=1;
                    }
                    else{

                        if(length>previousLength){
                            previousLength=length;
                        }
                        length=1;
                    }
                }
                if(length>previousLength){
                    System.out.println(length);
                }else{
                    System.out.println(previousLength);

                }
            }

        }


    }

