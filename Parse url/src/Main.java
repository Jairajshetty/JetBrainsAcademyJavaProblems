import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        String[] UrlArr=url.split("\\?");
        String reqUrl=UrlArr[1];
        String[] parArr=reqUrl.split("&");
        String pwd="";
        for(int i=0;i<parArr.length;i++){
            String[] sArr=parArr[i].split("=");
            if(sArr.length==1){
                System.out.println(sArr[0]+" : "+"not found");
            }else{
                System.out.println(sArr[0]+" : "+sArr[1]);
                if(sArr[0].equals("pass")){
                    pwd=sArr[1];
                }
            }
        }
        if(!pwd.equals("")){
            System.out.println("password : "+pwd);
        }
    }
}