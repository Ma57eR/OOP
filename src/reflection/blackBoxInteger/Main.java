package reflection.blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Scanner scan = new Scanner(System.in);

        Class<BlackBoxInt> blackBoxIntClass = BlackBoxInt.class;

        //Достъпваме конструктора
        Constructor<BlackBoxInt> cotr = blackBoxIntClass.getDeclaredConstructor();
        cotr.setAccessible(true);

        //Създавам инстанция на класа
        BlackBoxInt blackBoxInt = cotr.newInstance();

        String input = scan.nextLine();

        while (!input.equals("END")) {

            String[] methodData = input.split("_");
            String operation = methodData[0];
            int num = Integer.parseInt(methodData[1]);

            //Извикваме конкретния метод, който искаме да изпозлаваме
            Method method = blackBoxIntClass.getDeclaredMethod(operation, int.class);
            //Променяме му достъпа
            method.setAccessible(true);
            //Изпълняваме го с Invoke
            method.invoke(blackBoxInt, num);
            //Изваждаме полето, което ни интересува
            Field innerValue = blackBoxIntClass.getDeclaredField("innerValue");
            //Променяме му достъпа
            innerValue.setAccessible(true);
            //За принтирането на стойността трябва да подадем и обекта, в който е запазена стойността
            System.out.println(innerValue.get(blackBoxInt));
            input = scan.nextLine();
        }

    }
}
