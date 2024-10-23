package Commands.SetCommands;

public class SetTransportCommand extends SetCommand {

    public SetTransportCommand() {
        super("Вибір транспорту");
    }

    @Override
    public void execute() {
        System.out.println("\n\t**   Встановлення транспорту для путівки   **");
    }
}
