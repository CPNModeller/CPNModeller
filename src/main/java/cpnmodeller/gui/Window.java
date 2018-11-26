package cpnmodeller.gui;

import cpnmodeller.gui.texteditor.TextEditorPanel;

import javax.swing.*;

public class Window {

    private final String title;

    public Window(String title) {
        this.title = title;
    }

    public void create() {
        JFrame frame = new JFrame(title);

        frame.add(new TextEditorPanel());

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
