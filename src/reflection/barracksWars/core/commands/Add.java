package reflection.barracksWars.core.commands;

import reflection.barracksWars.interfaces.Repository;
import reflection.barracksWars.interfaces.Unit;
import reflection.barracksWars.interfaces.UnitFactory;

public class Add extends Command{


    public Add(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        String unitType = getData()[1];
        Unit unitToAdd = getUnitFactory().createUnit(unitType);
        getRepository().addUnit(unitToAdd);
        String output = unitType + " added!";
        return output;
    }
}
