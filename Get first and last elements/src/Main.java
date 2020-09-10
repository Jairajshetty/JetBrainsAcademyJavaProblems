import java.util.*;

public class Main {

    // write a method here
    public static int[] getFirstAndLast(int[] arr){
        int[] resArr=new int[2];
        if(arr.length==1){
            resArr[0]=arr[0];
            resArr[1]=arr[0];
            return resArr;
        }else{
            resArr[0]=arr[0];
            resArr[1]=arr[arr.length-1];
            return resArr;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}