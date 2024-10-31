package Commands;

import java.util.Scanner;
public class ShowList extends Command {

    public ShowList(String title) {
        super(title);
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        switch (title) {
            case "Вивести всі путівки":
                System.out.println("\n\t**   Вибрано всі путівки зі списку   **");
                break;

            case "За типом":
                systemVouchers.setVouchersByType();
                break;

            case "За країною":
                systemVouchers.setVouchersByCountry();
                break;

            case "За транспортом":
                systemVouchers.setVouchersByTransport();
                break;

            case "За бюджетом":
                systemVouchers.setVouchersByBudget();
                break;

            case "За харчуванням":
                systemVouchers.setVouchersByNutrition();
                break;
        }

        systemVouchers.showVouchers();
        System.out.print("\n\n\tНатисніть Enter, щоб продовжити...");
        scanner.nextLine();
    }
}