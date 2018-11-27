package cpnmodeller.gui;

import javax.swing.*;
import java.awt.*;

public class Window {

    private final String title;
    private final JComponent mainComponent;
    private final JMenuBar menuBar;
    private final JToolBar toolBar;

    public Window(String title, JComponent mainComponent, JMenuBar menuBar, JToolBar toolBar) {
        this.title = title;
        this.mainComponent = mainComponent;
        this.menuBar = menuBar;
        this.toolBar = toolBar;
    }

    public void create() {
        JFrame frame = new JFrame(title);

        frame.add(toolBar, BorderLayout.PAGE_START);
        frame.setJMenuBar(menuBar);
        frame.add(mainComponent, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
