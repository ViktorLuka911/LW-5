package Commands;

import java.util.Scanner;

public class Reference extends Command {

    public Reference(String title) {
        super(title);
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\t**   Виведення довідки про програму   **");
        System.out.print("\n\n\tНатисніть Enter, щоб продовжити...");
        scanner.nextLine();
    }
}