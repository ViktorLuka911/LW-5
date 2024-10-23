package Commands.SetCommands;

public class SetNumberOfDaysCommand extends SetCommand {

    public SetNumberOfDaysCommand() {
        super("Встановлення кількості днів");
    }

    @Override
    public void execute() {
        System.out.println("\n\t**   Встановлення кількості днів для путівки   **");
    }
}