import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        boolean aesc=true;
        boolean desc=true;
        int previousAesc=0;
        long previousDesc=963822136;
        while(scanner.hasNext()){
            int current=scanner.nextInt();
            if(current==0){
                break;
            }
            if(current<previousAesc){
                aesc=false;
            }else{
                previousAesc=current;
            }
            if(current>previousDesc){
                desc=false;
            }else{
                previousDesc=current;
            }

        }
        if(aesc==true||desc==true){
            System.out.print("true");
        }else{
            System.out.print("false");
        }

    }
}