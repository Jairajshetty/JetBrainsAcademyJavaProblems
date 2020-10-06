import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        Set<String> sArr=new HashSet<>();

        for(int i=0;i<=num;i++){
            String in=scanner.nextLine();
            sArr.add(in);
        }
        String[] arr= new String[sArr.size()];
        int k=0;
        for (String s:
             sArr) {
            arr[k]=s;
            k++;
        }

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    String temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for (String s :arr
             ) {
            System.out.println(s);
        }

    }
}