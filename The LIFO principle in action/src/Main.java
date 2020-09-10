import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        int total=scanner.nextInt();
        Deque<Integer> st=new ArrayDeque<>();
        for(int i=0;i<total;i++){
            st.offerLast(scanner.nextInt());
        }

        for(int i=0;i<total;i++){
            System.out.println(st.removeLast());
        }
    }
}