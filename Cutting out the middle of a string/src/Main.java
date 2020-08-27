import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String s=scanner.next();
        String[] aArr=s.split("");
        int sLength=s.length();
        if(sLength%2==0){
            for(int i=0;i<sLength;i++){
                if(i!=sLength/2 && i!=(sLength/2)-1){
                    System.out.print(aArr[i]);
                }
            }
        }else{
            for(int i=0;i<sLength;i++){
                if(i!=(sLength-1)/2){
                    System.out.print(aArr[i]);
                }
            }
        }
    }
}