package cpnmodeller;

import javax.swing.*;

public class Startup {
    private static void createAndShowGUI() {
        // Create the window
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
