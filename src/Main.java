
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Class<Reflection> reflection = Reflection.class;

        Field[] declaredFields = reflection.getDeclaredFields();
        List<String> fields = new ArrayList<>();
        List<String> getters = new ArrayList<>();
        List<String> setters = new ArrayList<>();


        for (Field declaredField : declaredFields) {
            if (!Modifier.isPrivate(declaredField.getModifiers())) {
                fields.add(declaredField.getName());
            }
        }
        Method[] declaredMethods = reflection.getDeclaredMethods();

        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.getName().startsWith("get") && !Modifier.isPublic(declaredMethod.getModifiers())) {
                getters.add(declaredMethod.getName());
            }
        }
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.getName().startsWith("set") && !Modifier.isPrivate(declaredMethod.getModifiers())) {
                setters.add(declaredMethod.getName());
            }
        }
       Collections.sort(fields);
       Collections.sort(getters);
       Collections.sort(setters);

        for (String field : fields) {
            System.out.println(field + " must be private!");
        }
        for (String getter : getters) {
            System.out.println(getter + " have to be public!");
        }
        for (String setter : setters) {
            System.out.println(setter + " have to be private!");
        }

    }
}
