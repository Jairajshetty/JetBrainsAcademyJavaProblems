import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner=new Scanner(System.in);
        String[][] colourArr=new String[4][4];
        for(int i=0;i<4;i++){
            colourArr[i]=scanner.next().split("");
        }
        boolean isPretty=true;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(colourArr[i][j].equals(colourArr[i][j+1])&&
                        colourArr[i][j].equals(colourArr[i+1][j+1])&&
                        colourArr[i][j].equals(colourArr[i+1][j])){
                    System.out.print("NO");
                    isPretty=false;
                    break;
                }
            }
        }

        if(isPretty){
            System.out.print("YES");
        }

    }
}