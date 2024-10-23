package Commands.SetCommands;

public class SetBudgetCommand extends SetCommand {

    public SetBudgetCommand() {
        super("Вибір бюджету");
    }

    @Override
    public void execute() {
        System.out.println("\n\t**   Встановлення бюджету для путівки   **");
    }
}
