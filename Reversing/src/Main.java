import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num=scanner.nextInt();
        int unit=num%10;
        int tenth=(num/10)%10;
        int hundreth=num/100;

        if(unit==0){
            System.out.println(tenth+""+hundreth);
        }else{
            System.out.println(unit+""+tenth+""+hundreth);
        }
    }
}