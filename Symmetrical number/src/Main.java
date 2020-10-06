import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        String n=scanner.nextLine();
        String num[]=n.split("");
        boolean truth=true;
        for(int i=0;i<4;i++){
            if(!num[i].equals(num[3-i])){
                truth=false;

                break;
            }
        }
        if(truth){
            System.out.println(1);
        }else{
            System.out.println(Integer.parseInt(n)+1);
        }


    }
}