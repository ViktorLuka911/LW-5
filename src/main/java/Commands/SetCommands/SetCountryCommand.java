package Commands.SetCommands;

public class SetCountryCommand extends SetCommand {

    public SetCountryCommand() {
        super("Вибір країни");
    }

    @Override
    public void execute() {
        System.out.println("\n\t**   Встановлення країни для путівки   **");
    }
}
