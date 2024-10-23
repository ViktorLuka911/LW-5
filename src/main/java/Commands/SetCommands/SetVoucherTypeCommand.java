package Commands.SetCommands;

public class SetVoucherTypeCommand extends SetCommand {

    public SetVoucherTypeCommand() {
        super("Вибір типу путівки");
    }

    @Override
    public void execute() {
        System.out.println("\n\t**   Встановлення типу для путівки   **");
    }
}
