package reflection.barracksWars.core.commands;


import reflection.barracksWars.interfaces.Repository;
import reflection.barracksWars.interfaces.UnitFactory;

public class Retire extends Command{
    public Retire(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        String unitType = getData()[1];
        getRepository().removeUnit(unitType);
        return unitType + " retired!";
    }
}
