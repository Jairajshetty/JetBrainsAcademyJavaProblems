import java.lang.reflect.Method;

class MethodFinder {

    public static String findMethod(String methodName, String[] classNames) {
        String res="";
        for (String c:classNames
             ) {
            try {
                Method[] Marr=Class.forName(c).getMethods();
                for (Method M:Marr
                     ) {
                    if(M.getName().equals(methodName)){
                        res=c;
                        break;
                    }
                }
            }catch (Exception E){

            }
        }
        return res;
    }
}