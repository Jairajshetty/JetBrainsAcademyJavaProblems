import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        int numberOfRecords=scanner.nextInt();
        scanner.nextLine();
        Set<String> records=new HashSet<>();
        for(int i=0;i<numberOfRecords;i++){
            records.add(scanner.nextLine().toLowerCase());
        }
        int numberOfLines=scanner.nextInt();
        scanner.nextLine();
        Set<String> lines=new HashSet<>();
        for(int i=0;i<numberOfLines;i++){
            lines.add(scanner.nextLine());
        }
        Set<String> words=new HashSet<>();
        for (String l:
             lines) {
            String[] larr=l.split(" ");
            for(int i=0;i<larr.length;i++){
                words.add(larr[i].toLowerCase());
            }
        }
        words.removeAll(records);
        for (String w:
             words) {
            System.out.println(w);
        }

    }
}