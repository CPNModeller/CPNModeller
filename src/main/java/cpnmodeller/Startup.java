package cpnmodeller;

import cpnmodeller.gui.Window;

import javax.swing.*;

public class Startup {
    private static void createAndShowGUI() {

        JToolBar toolBar = new JToolBar();
        JMenuBar menuBar = new JMenuBar();
        JSplitPane splitPane = new JSplitPane();

        Window window = new Window("CPN Modeller", splitPane, menuBar, toolBar);
        window.create();
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(Startup::createAndShowGUI);
    }
}
