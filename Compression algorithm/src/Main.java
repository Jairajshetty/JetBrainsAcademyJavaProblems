import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String in=scanner.next();
        String[] inArr=in.split("");
        int count =1;
        String curr=inArr[0];
        String res=inArr[0];
        for(int i=1;i<inArr.length;i++){
            if(inArr[i].equals(curr)){
                count++;
            }else{
                res+=count;
                res+=inArr[i];
                curr=inArr[i];
                count=1;
            }
        }
        System.out.println(res+count);
    }
}