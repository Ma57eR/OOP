package reflection.barracksWars.core;

import reflection.barracksWars.core.commands.Command;
import reflection.barracksWars.interfaces.Repository;
import reflection.barracksWars.interfaces.Runnable;
import reflection.barracksWars.interfaces.UnitFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public class Engine implements Runnable {

	private static String COMMAND_PATH = "reflection.barracksWars.core.commands.";
	private static String EXECUTE_METHOD = "execute";

	private Repository repository;
	private UnitFactory unitFactory;

	public Engine(Repository repository, UnitFactory unitFactory) {
		this.repository = repository;
		this.unitFactory = unitFactory;
	}

	@Override
	public void run() {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		while (true) {
			try {
				String input = reader.readLine();
				String[] data = input.split("\\s+");
				String commandName = data[0];
				String result = interpretCommand(data, commandName);
				if (result.equals("fight")) {
					break;
				}
				System.out.println(result);
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// TODO: refactor for problem 4
	private String interpretCommand(String[] data, String commandName) {
		String result = "";

		try {
			String commandClassName = commandName.substring(0,1).toUpperCase(Locale.ROOT) + commandName.substring(1).toLowerCase();
			//Създаваме си командата
			Class commandClass = Class.forName( COMMAND_PATH + commandClassName);
			//Взимаме конструктора на командата
			Constructor<Command> commandConstructor = commandClass.getDeclaredConstructor(String[].class, Repository.class, UnitFactory.class);
			//Създаваме нова инстанция за командата, която е подадена.
			Command commandInstance = commandConstructor.newInstance(data, this.repository, this.unitFactory);
			//Извикваме метода Execute
			Method executeMethod = commandClass.getDeclaredMethod(EXECUTE_METHOD);
			//Стартираме метода, който сме инстанцирали

			try {
				result = (String) executeMethod.invoke(commandInstance);

			} catch (InvocationTargetException e) {
				System.out.print(e.getCause().getMessage());
			}
		} catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
return result;

//		String result;
//		switch (commandName) {
//			case "add":
//				Add addComand = new Add(data, this.repository, this.unitFactory);
//				result = addComand.execute();
//				break;
//			case "report":
//				Report reportCommand = new Report(data, this.repository, this.unitFactory);
//				result = reportCommand.execute();
//				break;
//			case "fight":
//				Fight fightCommand = new Fight(data, this.repository, this.unitFactory);
//				result = fightCommand.execute();
//				break;
//			default:
//				throw new RuntimeException("Invalid command!");
//		}
//		return result;
	}

//	private String reportCommand(String[] data) {
//		String output = this.repository.getStatistics();
//		return output;
//	}

//	private String addUnitCommand(String[] data) throws ExecutionControl.NotImplementedException {
//		String unitType = data[1];
//		Unit unitToAdd = this.unitFactory.createUnit(unitType);
//		this.repository.addUnit(unitToAdd);
//		String output = unitType + " added!";
//		return output;
//	}
	
//	private String fightCommand(String[] data) {
//		return "fight";
//	}
}
