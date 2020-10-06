import javax.swing.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        Deque<Integer> intArr=new ArrayDeque<>();


        for(int i=0;i<num;i++){
            int input=scanner.nextInt();
            if(input%2!=0){
                intArr.offerLast(input);
            }else{
                intArr.offerFirst(input);
            }
        }

        for (Integer i:
             intArr) {
            System.out.println(i);
        }

    }
}