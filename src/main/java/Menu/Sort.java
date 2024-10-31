package Menu;

import Commands.Command;
import Commands.GoToMenu;
import Utilities.Utilities;
import java.util.ArrayList;
import java.util.Arrays;

public class Sort extends Menu {
    public Sort() {

        // Ініціалізація списку підменю
        ArrayList<Menu> subMenus = new ArrayList<>(
                Arrays.asList(
                        new SortOrder("Сортувати за назвою"),
                        new SortOrder("Сортувати за кількістю днів"),
                        new SortOrder("Сортувати за ціною"),
                        new SortOrder("Сортувати за датою")
                )
        );

        // Ініціалізація списку команд
        ArrayList<Command> commands = new ArrayList<>(
                Arrays.asList(
                        new GoToMenu("Сортувати за назвою", subMenus.get(0)),
                        new GoToMenu("Сортувати за кількістю днів", subMenus.get(1)),
                        new GoToMenu("Сортувати за ціною", subMenus.get(2)),
                        new GoToMenu("Сортувати за датою", subMenus.get(3))
                )
        );

        super("Меню вибору типу сортування", commands, subMenus);
    }

    @Override
    public void printMenu() {
        System.out.println("\n\t\t\t"  + title + "\n");
        int i = 0;
        while (i < commands.size()) {
            System.out.println("\t " + (i + 1) + " - " + commands.get(i).getTitle());
            i++;
        }
    }

    @Override
    public boolean selectCommand() {
        int choice = Utilities.getValidatedInput(1, 4);

        switch (choice) {
            case 1 -> commands.get(0).execute();
            case 2 -> commands.get(1).execute();
            case 3 -> commands.get(2).execute();
            case 4 -> commands.get(3).execute();
            default -> System.out.println("\tНеправильний вибір. Спробуйте ще раз.");
        }

        return false;
    }
}