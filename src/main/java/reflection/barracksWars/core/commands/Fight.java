package reflection.barracksWars.core.commands;

import reflection.barracksWars.interfaces.Repository;
import reflection.barracksWars.interfaces.UnitFactory;

public class Fight extends Command{
    public Fight(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        return "fight";
    }
}
