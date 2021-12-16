package reflection.barracksWars.core.factories;

import jdk.jshell.spi.ExecutionControl;
import reflection.barracksWars.interfaces.Unit;
import reflection.barracksWars.interfaces.UnitFactory;
import reflection.barracksWars.models.units.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME =
            "reflection.barracksWars.models.units.";

    @Override
    public Unit createUnit(String unitType) {
        // TODO: implement for problem 3
        try {
            Class unitClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
            Constructor<Unit> unitConstructor = unitClass.getDeclaredConstructor();
            return unitConstructor.newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

//        switch (unitType) {
//            case "Archer":
//                return new Archer();
//            case "Swordsman":
//                return new Swordsman();
//            case "Pikeman":
//                return new Pikeman();
//            case "Horseman":
//                return new Horseman();
//            case "Gunner":
//                return new Gunner();
//        }
        //throw new ExecutionControl.NotImplementedException("message");
        return null;
    }
}
