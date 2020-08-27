import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        String[] s=scanner.nextLine().split(" ");
        int len=0;
        int ind=0;
        for(int i=0;i<s.length;i++){
            if(s[i].length()>len){
                ind=i;
                len=s[i].length();
            }
        }
        System.out.print(s[ind]);
    }
}