package Commands;

public class DeleteVoucher extends Command {
    public DeleteVoucher(String title) {
        super(title);
    }

    @Override
    public void execute() {
        systemVouchers.deleteVoucher();
    }
}