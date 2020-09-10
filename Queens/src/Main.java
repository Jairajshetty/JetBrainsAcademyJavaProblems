import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        double x1=scanner.nextInt();
        double y1=scanner.nextInt();
        double x2=scanner.nextInt();
        double y2=scanner.nextInt();

        if(x1==x2||y1==y2){
            System.out.println("YES");
        }else if(inDiagonal(x1,y1,x2,y2)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static boolean inDiagonal(double x1,double y1,double x2,double y2){
        double res=Math.abs(y2-y1)/Math.abs(x2-x1);
        if(res==1){
            return true;
        }
        return false;

    }
}