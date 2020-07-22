import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        String[] in=scanner.nextLine().split("");
        int ind=-1;
        for(int i=0;i<in.length;i++){
            if(in[i].equals("T")||in[i].equals("t")){
                ind=i;
                if(in[i+1].equals("h")&&in[i+2].equals("e")){
                    System.out.println(ind);
                    break;
                }
            }
        }
        if(ind==-1){
            System.out.println(ind);
        }

    }
}