import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // start coding here
        String str=reader.readLine().trim();
        reader.close();
        String[] s=str.split("\\s+");
        if(str.equals("")){
            System.out.print(0);
        }else{
            System.out.println(s.length);
        }
    }
}