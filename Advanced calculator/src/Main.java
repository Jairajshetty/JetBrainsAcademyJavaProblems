/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        String operator = args[0];
        // write your code here
        switch (operator){
            case "MAX":maxFunc(args);
            break;
            case "MIN":minFunc(args);
            break;
            case "SUM":sumFunc(args);
            break;
            default:
                break;
        }
    }
    public static void maxFunc(String[] args){
        int max=0;
        if(args.length==2){
            System.out.print(args[1]);
        }else{
            for(int i=1;i<args.length;i++){
                if(Integer.parseInt(args[i])>max){
                    max=Integer.parseInt(args[i]);
                }
            }
            System.out.print(max);
        }
    }
    public static void minFunc(String[] args){
        int min=9999;
        if(args.length==2){
            System.out.print(args[1]);
        }else{
            for(int i=1;i<args.length;i++){
                if(Integer.parseInt(args[i])<min){
                    min=Integer.parseInt(args[i]);
                }
            }
            System.out.print(min);
        }
    }
    public static void sumFunc(String[] args){
        int sum=0;
        if(args.length==2){
            System.out.print(args[1]);
        }else{
            for(int i=1;i<args.length;i++){
                sum+=Integer.parseInt(args[i]);

            }
            System.out.print(sum);
        }
    }
}