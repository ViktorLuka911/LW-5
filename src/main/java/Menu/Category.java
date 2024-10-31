package Menu;

import Commands.Command;
import Commands.ShowList;
import java.util.ArrayList;
import java.util.Arrays;
import Utilities.Utilities;

public class Category extends Menu {
    public Category() {

        // Ініціалізація списку підменю
        ArrayList<Menu> subMenus = new ArrayList<>();

        // Ініціалізація списку команд
        ArrayList<Command> commands = new ArrayList<>(
                Arrays.asList(
                        new ShowList("Вивести всі путівки"),
                        new ShowList("За країною"),
                        new ShowList("За типом"),
                        new ShowList("За транспортом"),
                        new ShowList("За харчуванням"),
                        new ShowList("За бюджетом")
                )
        );

        super("Меню для вибору категорії виведення", commands, subMenus);
    }

    @Override
    public void printMenu() {
        System.out.println("\n\t\t\t" + title  + "\n");
        int i = 0;
        while (i < commands.size()) {
            System.out.println("\t " + (i + 1) + " - " + commands.get(i).getTitle());
            i++;
        }
    }

    @Override
    public boolean selectCommand() {
        int choice = Utilities.getValidatedInput(1, 8);
        boolean isRunning = true;
        switch (choice) {
            case 1 -> commands.get(0).execute();
            case 2 -> commands.get(1).execute();
            case 3 -> commands.get(2).execute();
            case 4 -> commands.get(3).execute();
            case 5 -> commands.get(4).execute();
            case 6 -> commands.get(5).execute();
            case 7 -> commands.get(6).execute();
            case 8 -> isRunning = false;
        }
        return false;
    }
}