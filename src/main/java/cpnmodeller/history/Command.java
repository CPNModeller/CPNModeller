package cpnmodeller.history;

public interface Command {

    /**
     * Execute the command.
     */
    void commit();

    /**
     * Revert the state of this command to before it was executed.
     */
    void revert();

}
