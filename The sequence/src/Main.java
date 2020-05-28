import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        int result=0;
        while(num!=0){
            int inum=scanner.nextInt();
            if(inum%4==0&&inum>result){
                result=inum;
            }
            num--;
        }
        System.out.println(result);
    }
}