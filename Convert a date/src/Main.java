import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String s=scanner.nextLine();
        String[] sarr=s.split("-");
        System.out.printf("%s/%s/%s",sarr[1],sarr[2],sarr[0]);
    }
}