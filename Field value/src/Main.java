import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Get value for a given public field or null if the field does not exist or is not accessible.
 */
class FieldGetter {

    public Object getFieldValue(Object object, String fieldName) throws IllegalAccessException {
        Object res=null;
        try{

            try {
                Field f = object.getClass().getField(fieldName);
                return f.get(object);
            }
            catch ( NoSuchFieldException ex) {
                // field doesn't exist
            }
            catch (SecurityException ex) {
                // no access to field
            }
        }catch(Exception E){

        }
        return res;
    }


}