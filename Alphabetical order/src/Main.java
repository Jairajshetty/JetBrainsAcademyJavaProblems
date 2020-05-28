import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String first="a";
        boolean res=true;
        while(scanner.hasNext()){
            String str=scanner.next();
            if(str.compareTo(first)<0){
                res=false;
                break;
            }else{
                first=str;
            }
        }

        System.out.println(res);
    }
}