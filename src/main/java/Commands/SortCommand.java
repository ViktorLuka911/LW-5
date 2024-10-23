package Commands;

import java.util.Scanner;

public class SortCommand extends Command {
    private String type;

    public SortCommand(String type, String title) {
        super(title);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        boolean ascending = getTitle().equals("За зростанням");

        switch (getType()) {
            case "Сортувати за назвою":
                systemVouchers.sortVouchersByName(ascending);
                break;

            case "Сортувати за кількістю днів":
                systemVouchers.sortVouchersByDays(ascending);
                break;

            case "Сортувати за ціною":
                systemVouchers.sortVouchersByPrice(ascending);
                break;

            case "Сортувати за датою":
                systemVouchers.sortVouchersByDate(ascending);
                break;
        }
        systemVouchers.showVouchers();
        System.out.print("\n\n\tНатисніть Enter, щоб продовжити...");
        scanner.nextLine();
    }
}