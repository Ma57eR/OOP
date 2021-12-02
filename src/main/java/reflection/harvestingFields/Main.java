package reflection.harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String modType = scan.nextLine();
        Class<RichSoilLand> richSoilLandClass = RichSoilLand.class;
        Field[] declaredFields = richSoilLandClass.getDeclaredFields();

        while (!modType.equals("HARVEST")) {


            switch (modType) {
                case "private":
                    for (Field declaredField : declaredFields) {
                        //Ако модифиъра е Private, влиза, за да печата
                        if (Modifier.isPrivate(declaredField.getModifiers())) {

                            //Превръщаме инт-а на модифиъра в стойността му
                            System.out.println(Modifier.toString(declaredField.getModifiers()) + " " + declaredField.getType().getSimpleName() + " " + declaredField.getName());
                        }
                    }
                    break;
                case "protected":
                    for (Field declaredField : declaredFields) {
                        //Ако модифиъра е Private, влиза, за да печата
                        if (Modifier.isProtected(declaredField.getModifiers())) {
                            System.out.println(Modifier.toString(declaredField.getModifiers()) + " " + declaredField.getType().getSimpleName() + " " + declaredField.getName());
                        }
                    }
                    break;
                case "public":
                    for (Field declaredField : declaredFields) {
                        //Ако модифиъра е Private, влиза, за да печата
                        if (Modifier.isPublic(declaredField.getModifiers())) {

                            //Превръщаме инт-а на модифиъра в стойността му
                            System.out.println(Modifier.toString(declaredField.getModifiers()) + " " + declaredField.getType().getSimpleName() + " " + declaredField.getName());
                        }
                    }
                    break;
				case "all":
					for (Field declaredField : declaredFields) {
						System.out.println(Modifier.toString(declaredField.getModifiers()) + " " + declaredField.getType().getSimpleName() + " " + declaredField.getName());
					}
					break;
            }


            modType = scan.nextLine();
        }

    }
}
