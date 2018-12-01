package cpnmodeller.gui;

import javax.swing.*;
import java.awt.*;

public class Window {

    private final String title;
    private final JSplitPane splitPane;
    private final JMenuBar menuBar;
    private final JToolBar toolBar;

    public Window(String title, JSplitPane splitPane, JMenuBar menuBar, JToolBar toolBar) {
        this.title = title;
        this.splitPane = splitPane;
        this.menuBar = menuBar;
        this.toolBar = toolBar;
    }

    public void create() {
        JFrame frame = new JFrame(title);

        frame.add(toolBar, BorderLayout.PAGE_START);
        frame.setJMenuBar(menuBar);

        frame.add(splitPane, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
