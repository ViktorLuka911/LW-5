package Commands.SetCommands;

public class SetDateCommand extends SetCommand {

    public SetDateCommand() {
        super("Встановлення дати путівки");
    }

    @Override
    public void execute() {
        System.out.println("\n\t**   Встановлення дати для путівки   **");
    }
}