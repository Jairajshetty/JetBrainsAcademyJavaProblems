import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.io.File;
import java.util.*;


public class fileSum {
    public static String readFileAsString(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public static void main(String[] args) {

        String pathToHelloWorldJava = "C:\\Users\\jshetty\\IdeaProjects\\Readability Score\\Problems\\Advanced calculator\\src\\dataset_91065.txt";
        try {
            File file = new File (pathToHelloWorldJava);
            Scanner scanner = new Scanner(file);
            int count=0;
            while(scanner.hasNext()){
                int n=Integer.parseInt(scanner.nextLine());
                if(n==0){
                    break;
                }else{
                    if(n%2==0){
                        count++;
                    }
                }
            }

            System.out.println(count);
        } catch (IOException e) {
            System.out.println("Cannot read file: " + e.getMessage());
        }
    }
}