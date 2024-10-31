package Menu;

import Commands.Command;
import Commands.Sort;
import Utilities.Utilities;
import java.util.ArrayList;
import java.util.Arrays;

public class SortOrder extends Menu {

    public SortOrder(String type) {

        // Ініціалізація списку підменю
        ArrayList<Menu> subMenus = new ArrayList<>();

        // Ініціалізація списку команд
        ArrayList<Command> commands = new ArrayList<>(
                Arrays.asList(
                        new Sort(type, "За зростанням"),
                        new Sort(type, "За спаданням")
                )
        );

        super("Меню вибору порядку сортування", commands, subMenus);
    }

    @Override
    public void printMenu() {
        System.out.println("\n\t\t\t" + title + "\n");
        int i = 0;
        while (i < commands.size()) {
            System.out.println("\t " + (i + 1) + " - " + commands.get(i).getTitle());
            i++;
        }
    }

    @Override
    public boolean selectCommand() {
        int choice = Utilities.getValidatedInput(1, 2);

        switch (choice) {
            case 1 -> commands.get(0).execute();
            case 2 -> commands.get(1).execute();
            default -> System.out.println("\tНеправильний вибір. Спробуйте ще раз." + "\n");
        }

        return false;
    }
}