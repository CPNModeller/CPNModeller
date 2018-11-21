package cpnmodeller.history;

import java.util.Stack;

public final class HistoryContext {

    /**
     * The commands that were registered. All commands should be committed before being added to this collection.
     */
    private final Stack<Command> history = new Stack<>();

    /**
     * The commands that were undone. All commands should be reverted before being added to this collection.
     */
    private final Stack<Command> undone = new Stack<>();

    /**
     * Register a command to history. This will commit the command as well.
     *
     * @param command The command to register
     */
    public void commit(Command command) {
        command.commit();

        history.push(command);
        undone.clear();
    }

    /**
     * Remove the last command from the history, and revert it.
     */
    public void undo() {
        if (history.empty()) {
            return;
        }

        final Command command = history.pop();
        command.revert();

        undone.push(command);
    }

    /**
     * Redo the last undone command.
     */
    public void redo() {
        if (undone.empty()) {
            return;
        }

        final Command command = undone.pop();
        commit(command);
    }
}
