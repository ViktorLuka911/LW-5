package Commands;

public class DeleteVoucherCommand extends Command {
    public DeleteVoucherCommand(String title) {
        super(title);
    }

    @Override
    public void execute() {
        systemVouchers.deleteVoucher();
    }
}