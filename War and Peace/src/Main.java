import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> text=new ArrayList<>();
        Set<String> s=new HashSet<>();
        while(scanner.hasNext()){
            text.add(scanner.next().toLowerCase());
        }
        s.addAll(text);
        for (String st:
             s) {
            int count=0;
            for (String tex:
                 text) {
                if(st.equals(tex)){
                    count++;
                }
            }
            System.out.println(st+" "+count);
        }
    }
}