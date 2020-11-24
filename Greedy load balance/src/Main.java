import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        Map<Integer,Integer> Tasks=new HashMap<>();
        List<Integer> tasks1=new ArrayList<>();
        int load1=0;
        int load2=0;
        List<Integer> tasks2=new ArrayList<>();
        int TotalTasks=scanner.nextInt();
        for(int i=0;i<TotalTasks;i++){
            int id=scanner.nextInt();
            int load=scanner.nextInt();
            Tasks.put(id,load);
        }
        for (Integer k:Tasks.keySet()
             ) {
            if(load1>load2){
                tasks2.add(k);
                load2+=Tasks.get(k);
            }else{
                tasks1.add(k);
                load1+=Tasks.get(k);
            }
        }

        for (int i:tasks1
             ) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i:tasks2
        ) {
            System.out.print(i+" ");
        }
    }
}