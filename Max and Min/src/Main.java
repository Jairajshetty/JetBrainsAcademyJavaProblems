import java.util.Scanner;

class Finder {

    private FindingStrategy strategy;

    public Finder(FindingStrategy strategy) {
        // write your code here
        this.strategy=strategy;
    }

    /**
     * It performs the search algorithm according to the given strategy
     */
    public int find(int[] numbers) {
        // write your code here
        return this.strategy.getResult(numbers);
    }
}

interface FindingStrategy {

    /**
     * Returns search result
     */
    int getResult(int[] numbers);

}

class MaxFindingStrategy implements FindingStrategy {

    public int getResult(int[] numbers) {
        // write your code here
        if(numbers.length==0){
            return Integer.MIN_VALUE;
        }else if(numbers.length==1){
            return numbers[0];
        }else{
            int res=Integer.MIN_VALUE;
            for (int n:numbers
            ) {
                if(n>res){
                    res=n;
                }
            }
            return res;
        }

    }
}

class MinFindingStrategy implements FindingStrategy {

    public int getResult(int[] numbers) {
        // write your code here
        if(numbers.length==0){
            return Integer.MAX_VALUE;
        }else if(numbers.length==1){
            return numbers[0];
        }else{
            int res=Integer.MAX_VALUE;
            for (int n:numbers
                 ) {
                if(n<res){
                    res=n;
                }
            }
            return res;
        }
    }
}

/* Do not change code below */
public class Main {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final String[] elements = scanner.nextLine().split("\\s+");
        int[] numbers = null;

        if (elements[0].equals("EMPTY")) {
            numbers = new int[0];   
        } else {
            numbers = new int[elements.length];
            for (int i = 0; i < elements.length; i++) {
                numbers[i] = Integer.parseInt(elements[i]);
            }
        }

        final String type = scanner.nextLine();

        Finder finder = null;

        switch (type) {
            case "MIN":
                finder = new Finder(new MinFindingStrategy());
                break;
            case "MAX":
                finder = new Finder(new MaxFindingStrategy());
                break;
            default:
                break;
        }

        if (finder == null) {
            throw new RuntimeException(
                    "Unknown strategy type passed. Please, write to the author of the problem.");
        }

        System.out.println(finder.find(numbers));
    }
}