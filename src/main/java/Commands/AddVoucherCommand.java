package Commands;

public class AddVoucherCommand extends Command {

    public AddVoucherCommand(String title) {
        super(title);
    }

    @Override
    public void execute() {
        systemVouchers.addVoucher();
    }
}