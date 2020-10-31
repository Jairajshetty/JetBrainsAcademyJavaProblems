import java.io.InputStream;

class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;

        boolean truth=true;
        while(truth){
            int val=inputStream.read();
            if(val==-1){
                inputStream.close();
                truth=false;
            }else{
                System.out.print(val);
            }


        }

    }
}