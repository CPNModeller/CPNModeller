package cpnmodeller;

import cpnmodeller.gui.Window;

import javax.swing.*;

public class Startup {
    private static void createAndShowGUI() {
        Window window = new Window("CPN Modeller");
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
