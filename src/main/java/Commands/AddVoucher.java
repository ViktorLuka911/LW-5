package Commands;

public class AddVoucher extends Command {

    public AddVoucher(String title) {
        super(title);
    }

    @Override
    public void execute() {
        systemVouchers.addVoucher();
    }
}