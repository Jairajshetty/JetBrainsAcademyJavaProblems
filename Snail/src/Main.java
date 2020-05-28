import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int steps = scanner.nextInt();
        int day = scanner.nextInt();
        int night = scanner.nextInt();
        int diff = day-night;
        int result = ((steps-day)/(day-night))+1;
        int adjust = day+((result-1)*diff);
        int adj =(steps-1)/adjust;
        System.out.println(result+adj);
    }
}