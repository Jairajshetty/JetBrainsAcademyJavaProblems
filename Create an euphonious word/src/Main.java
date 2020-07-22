import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner=new Scanner(System.in);
        String[] sArr=scanner.next().split("");
        int len=sArr.length;
        int vowelLength=0;
        int consonantsLength=0;
        int res=0;
        for(int i=0;i<len;i++){
            if(isVowel(sArr[i])){
                consonantsLength=0;
                vowelLength++;
            }else{
                vowelLength=0;
                consonantsLength++;
            }
            if(vowelLength>=3){
                res++;
                vowelLength-=2;
            }
            if(consonantsLength>=3){
                res++;
                consonantsLength-=2;
            }
        }
        System.out.println(res);
    }
    public static boolean isVowel(String  s){
        if(s.equals("a")||s.equals("y")||s.equals("Y")||s.equals("e")||s.equals("i")||s.equals("o")||s.equals("u")||s.equals("A")||s.equals("E")||s.equals("I")||s.equals("O")||s.equals("U")){
            return true;
        }
        else{
            return false;
        }
    }
}