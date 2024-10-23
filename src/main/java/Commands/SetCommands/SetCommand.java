package Commands.SetCommands;

public abstract class SetCommand {

    protected String title;

    public SetCommand(String title) {
        this.title = title;
    }

    public abstract void execute();
}