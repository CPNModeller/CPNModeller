package cpnmodeller.gui.panels.texteditor;

import javax.swing.*;
import java.awt.*;

public final class TextEditorPanel extends JPanel {

    private final JTextPane textPane;

    public TextEditorPanel() {
        textPane = new JTextPane(new StandardMLDocument());

        setLayout(new BorderLayout());
        add(textPane, BorderLayout.CENTER);
    }
}
