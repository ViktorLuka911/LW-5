package Commands.SetCommands;

public class SetNutritionCommand extends SetCommand {

    public SetNutritionCommand() {
        super("Вибір харчування");
    }

    @Override
    public void execute() {
        System.out.println("\n\t**   Встановлення харчування для путівки   **");
    }
}