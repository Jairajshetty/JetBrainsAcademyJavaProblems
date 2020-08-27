import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int A=0;
        int B=0;
        int C=0;
        int D=0;
        for(int i=0;i<n;i++){
            int grade=scanner.nextInt();
            switch (grade){
                case 5:A++;
                break;
                case 4:B++;
                break;
                case 3:C++;
                break;
                case 2:D++;
                break;
                default:break;
            }
        }

        System.out.print(D +" "+C+" "+B+" "+A);
    }
}