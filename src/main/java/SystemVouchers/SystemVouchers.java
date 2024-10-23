package SystemVouchers;

import java.util.Scanner;

public class SystemVouchers {
    private static SystemVouchers instance;

    public static SystemVouchers getInstance() {
        if (instance == null) {
            instance = new SystemVouchers();
        }
        return instance;
    }

    public void showVouchers() {
        System.out.println("\n\t**   Виведення списку путівок   **");
    }

    public void addVoucher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\t**   Додавання путівки до списку   **");

        System.out.print("\n\n\tНатисніть Enter, щоб продовжити...");
        scanner.nextLine();
    }

    public void deleteVoucher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\t**   Видалення путівки зі списку   **");

        System.out.print("\n\n\tНатисніть Enter, щоб продовжити...");
        scanner.nextLine();
    }

    public void setVouchersByType() {
        System.out.println("\n\t**   Вибрано путівки за типом   **");
    }

    public void setVouchersByCountry() {
        System.out.println("\n\t**   Вибрано путівки за країною   **");
    }

    public void setVouchersByTransport() {
        System.out.println("\n\t**   Вибрано путівки за транспортом   **");
    }

    public void setVouchersByNutrition() {
        System.out.println("\n\t**   Вибрано путівки за типом харчування   **");
    }

    public void setVouchersByBudget() {
        System.out.println("\n\t**   Вибрано путівки за типом бюджету   **");
    }

    public void sortVouchersByName(boolean ascending) {
        System.out.println("\n\t**   Путівки посортовано за назвою по " + ((ascending)? "зростанню" : "спаданню") + "   **");
    }

    public void sortVouchersByDays(boolean ascending) {
        System.out.println("\n\t**   Путівки посортовано за кількістю днів по " + ((ascending)? "зростанню" : "спаданню") + "   **");
    }

    public void sortVouchersByPrice(boolean ascending) {
        System.out.println("\n\t**   Путівки посортовано за ціною по " + ((ascending)? "зростанню" : "спаданню") + "   **");
    }

    public void sortVouchersByDate(boolean ascending) {
        System.out.println("\n\t**   Путівки посортовано за датою по " + ((ascending)? "зростанню" : "спаданню") + "   **");
    }
}