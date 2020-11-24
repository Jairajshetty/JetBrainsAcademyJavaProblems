import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String time = scanner.nextLine();
        System.out.println(isValid(time) ? "YES" : "NO");
    }

    public static boolean isValid(String time){
        if(time.contains(":")){
            String hour=time.split(":")[0];
            String min=time.split(":")[1];

            if(hour.length()!=2||min.length()!=2){
                return false;
            }
            else{
                int h=Integer.parseInt(hour);
                int m=Integer.parseInt(min);
                if(h>=0&&h<=23&&m>=0&&m<=59){
                    return true;
                }else{
                    return false;
                }
            }
        }else{
            return false;
        }

    }
}