package cpnmodeller.gui.menus;

import javax.swing.*;

public class EditMenu extends JMenu {

    public EditMenu() {
        super("Edit");

        add(new JMenuItem("Copy"));
        add(new JMenuItem("Cut"));
        add(new JMenuItem("Paste"));
    }

}
