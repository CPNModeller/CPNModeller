package cpnmodeller.gui.menus;

import javax.swing.*;

public class FileMenu extends JMenu {

    public FileMenu() {
        super("File");

        add(new JMenuItem("New"));
        addSeparator();
        add(new JMenuItem("Save"));
        add(new JMenuItem("Save As"));
        addSeparator();
        add(new JMenuItem("Exit"));
    }

}
