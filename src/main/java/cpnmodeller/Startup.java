package cpnmodeller;

import cpnmodeller.declarations.Declarations;
import cpnmodeller.gui.Window;
import cpnmodeller.gui.declarationslist.DeclarationsTree;
import cpnmodeller.gui.declarationslist.DeclarationsScrollPane;
import cpnmodeller.gui.grapheditor.GraphEditorPanel;
import cpnmodeller.gui.menus.EditMenu;
import cpnmodeller.gui.menus.FileMenu;
import cpnmodeller.gui.menus.HelpMenu;

import javax.swing.*;

public class Startup {
    private static void createAndShowGUI() {

        JToolBar toolBar = new JToolBar();

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(new FileMenu());
        menuBar.add(new EditMenu());
        menuBar.add(new HelpMenu());

        JScrollPane p = (new DeclarationsScrollPane(new DeclarationsTree(new Declarations()))).getJScrollPane();
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, p, new GraphEditorPanel());

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
