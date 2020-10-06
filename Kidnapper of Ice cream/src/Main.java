import java.util.*;
class Main {
    private static ArrayList<String> aW=new ArrayList<>();
    private static ArrayList<String> Note=new ArrayList<>();
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        String[] availableWords=scanner.nextLine().split(" ");
        String[] note=scanner.nextLine().split(" ");
        boolean result=true;
        for (String a:
             availableWords) {
            aW.add(a);
        }
        for (String n:
                note) {
            Note.add(n);
        }

        for (String noteWord:
             Note) {
            if(aW.contains(noteWord)){
                aW.remove(aW.indexOf(noteWord));
            }else{
                result=false;
                break;
            }
        }

        if(result){
            System.out.println("You get money");
        }else{
            System.out.println("You are busted");
        }


    }
}