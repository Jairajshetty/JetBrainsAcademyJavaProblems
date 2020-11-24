import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        int l=scanner.nextInt();
        int h=scanner.nextInt();
        int count=scanner.nextInt();
        Map<Integer,String> inputMap=new HashMap<>();
        for(int i=0;i<count;i++){
            int key=scanner.nextInt();
            String val=scanner.next();
            inputMap.put(key,val);
        }

        for (int k:inputMap.keySet()
             ) {
            if(k>=l&&k<=h){
                System.out.println(k+" "+inputMap.get(k));
            }
        }
    }
}