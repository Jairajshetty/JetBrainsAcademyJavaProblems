class Primitive {
    public static boolean toPrimitive(Boolean b) {

        try{
            boolean res=b;
            return res;
        }catch (Exception e){
            return false;
        }

    }
}