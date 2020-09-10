import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        while (scanner.hasNext()){
            arr.add(scanner.nextInt());
        }

        int arrSize=arr.size();
        int num = arr.get(arrSize-1);
        arr.remove(arrSize-1);

        int diff=0;

        ArrayList<Integer> closest=new ArrayList<>();
        boolean truth=true;
        while(truth){
            if(arr.contains(num-diff)||arr.contains(num+diff)){
                if(arr.contains(num+diff)){
                    closest.add(num+diff);
                }
                if(arr.contains(num-diff)){
                    closest.add(num-diff);
                }
                truth=false;
            }else{
                diff++;
            }
        }

        Collections.sort(arr);
        for(Integer n : arr){
            if(closest.contains(n)){
                System.out.print(n+" ");
            }
        }
    }
}