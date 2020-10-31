import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 Get sorted list of private fields the object declares (inherited fields should be skipped).
 */
class FieldGetter {

    public List<String> getPrivateFields(Object object) {
        // Add implementation here
        ArrayList<String > res=new ArrayList<>();
        Field[] Farr=object.getClass().getDeclaredFields();

        for (Field F:Farr
             ) {
            if(Modifier.isPrivate(F.getModifiers())){
                res.add(F.getName());
            }
        }
        Collections.sort(res);

        return res;


    }

}