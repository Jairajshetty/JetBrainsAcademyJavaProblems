import java.util.*;

class Main {
    private static Deque<Integer> stack =new ArrayDeque<>();
    private static Deque<Integer> stackOrder=new ArrayDeque<>();
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        for(int i=0;i<=num;i++){
            String com=scanner.nextLine();
//            System.out.println(com);
            String[] comArr=com.split(" ");

            if(comArr.length==2){
                Integer pushNum=Integer.parseInt(comArr[1]);
                PerformPush(stack,pushNum);
                if(stackOrder.isEmpty()){
                    stackOrder.offer(pushNum);
                }else{
                    if(stackOrder.peekLast()<pushNum){
                        stackOrder.offerLast(pushNum);
                    }else{
                        stackOrder.offerLast(stackOrder.peekLast());
                    }
                }
            }else{
                switch (comArr[0]){
                    case "max":PerformMax(stackOrder);
                    break;
                    case "pop":PerformPop(stack,stackOrder);
                    break;
                    default:break;
                }
            }
        }
    }

    public static void PerformPush(Deque<Integer> stack,int n){
        stack.offerLast(n);
    }
    public static void PerformMax(Deque<Integer> stack){
        System.out.println(stack.peekLast());
    }
    public static void PerformPop(Deque<Integer> stack,Deque<Integer> stackOrder){
        stackOrder.removeLast();
        stack.removeLast();

    }


}