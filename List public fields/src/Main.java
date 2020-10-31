import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/**
 Get list of public fields the object declares (inherited fields should be skipped).
 */
class FieldGetter {

    public String[] getPublicFields(Object object) {
        // Add implementation here
        ArrayList<String> res=new ArrayList<>();
        Field[] Farr=object.getClass().getDeclaredFields();
        for (Field F:Farr
             ) {
            if(Modifier.isPublic(F.getModifiers())){
                res.add(F.getName());
            }
        }
        String[] fin=new String[res.size()];
        for(int i=0;i<res.size();i++){
            fin[i]=res.get(i);
        }
        return fin;
    }

}