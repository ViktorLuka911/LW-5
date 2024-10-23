package Commands.SetCommands;

public class SetVoucherDetailsCommand extends SetCommand {

    public SetVoucherDetailsCommand() {
        super("Встановити назву путівки");
    }

    @Override
    public void execute() {
        System.out.println("\n\t**   Встановлення назви для путівки   **");
    }
}