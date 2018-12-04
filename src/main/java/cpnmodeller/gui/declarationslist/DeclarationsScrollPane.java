package cpnmodeller.gui.declarationslist;

import javax.swing.*;

public class DeclarationsScrollPane {

    private DeclarationsTree declarationsTree;
    private JScrollPane scrollPane;

    public DeclarationsScrollPane(DeclarationsTree t){
        this.declarationsTree = t;
        scrollPane = new JScrollPane(declarationsTree.getJTree());
    }

    public JScrollPane getJScrollPane(){
        return this.scrollPane;
    }
}
