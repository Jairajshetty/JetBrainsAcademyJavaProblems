import java.util.*;
class Problem {

    public static void main(String[] args) {
        // Write your code here
        for(int i=0;i<args.length;i++){
            System.out.print(args[i]);
            if((i%2)==0){
                System.out.print("=");
            }
            if((i+1)%2==0){
                System.out.println();
            }
        }

    }
}