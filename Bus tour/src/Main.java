import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int busHeight=scanner.nextInt();
        int numberOfBridges=scanner.nextInt();
        boolean willCrash=false;

        for(int i=1;i<=numberOfBridges;i++){
            int bridgeHeight=scanner.nextInt();
            if(busHeight>=bridgeHeight){
                System.out.print("Will crash on bridge "+i);
                willCrash=true;
                break;
            }
        }
        if(!willCrash){
            System.out.print("Will not crash");
        }

    }
}