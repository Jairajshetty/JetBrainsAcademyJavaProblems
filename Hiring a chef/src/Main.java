//put imports you need here
import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        String firstName=scanner.next();
        Integer age=scanner.nextInt();
        String Education=scanner.next();
        Integer Experience=scanner.nextInt();
        String cuisine=scanner.next();

        System.out.println("The form for "+firstName+" is completed. We will contact you if we need a chef that cooks "+cuisine+" dishes.");
    }
}