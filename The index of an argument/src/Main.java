
class Problem {
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++){
            if(args[i].equals("test")){
                System.out.print(i);
                return;
            }
        }
        System.out.print(-1);
    }
}