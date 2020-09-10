import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String s=scanner.nextLine();
            if(!s.equals("0")){
                try {
                    System.out.println(Integer.parseInt(s)*10);
                }catch (Exception e){
                    System.out.println("Invalid user input: "+s);
                }
            }else{
                break;
            }

        }

    }
}