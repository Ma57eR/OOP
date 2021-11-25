package reflection.reflection;

import reflection.gettersSetters.Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {


        Class reflection = Reflection.class;
        List<String> sortedGetters = new ArrayList<>();
        Method[] declaredMethods = reflection.getDeclaredMethods();

        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.getName().startsWith("get")) {
                sortedGetters.add(declaredMethod.getName() + " will return class " + declaredMethod.getReturnType());
            }
        }
        Collections.sort(sortedGetters);

        List<String> sortedSetters = new ArrayList<>();
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.getName().startsWith("set")) {
                sortedSetters.add(declaredMethod.getName() + " and will set field of class " + Arrays.toString(declaredMethod.getParameterTypes()));
            }
        }
        Collections.sort(sortedSetters);

        for (String sortedGetter : sortedGetters) {
            System.out.println(sortedGetter);
        }
        for (String sortedSetter : sortedSetters) {
            System.out.println(sortedSetter);
        }
    }
}
