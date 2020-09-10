import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String s=scanner.nextLine();
        int first=0;
        int second=0;
        for(int i=0;i<6;i++){
            if(i<3){
                first+=Character.getNumericValue(s.charAt(i));
            }else{
                second+=Character.getNumericValue(s.charAt(i));
            }
        }
        if(first==second){
            System.out.println("Lucky");
        }else{
            System.out.println("Regular");
        }
    }
}