import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str=reader.readLine();
        reader.close();

        String[] sArr=str.split("");
        for(int i=sArr.length-1;i>=0;i--){
            System.out.print(sArr[i]);
        }
        // start coding here

    }
}