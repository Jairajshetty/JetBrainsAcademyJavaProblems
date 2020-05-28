import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String firstLine=scanner.nextLine().trim().replace(" ","");
        String secondLine=scanner.nextLine().trim().replace(" ","");
        System.out.print(firstLine.equals(secondLine));
    }
}