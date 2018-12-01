package cpnmodeller.gui.definitionslist;

import javax.swing.*;

public class DefinitionsScrollPane{

    private DeclarationsTree declarationsTree;
    private JScrollPane scrollPane;

    public DefinitionsScrollPane(DeclarationsTree t){
        this.declarationsTree = t;
        scrollPane = new JScrollPane(declarationsTree.getJTree());
    }

    public JScrollPane getJScrollPane(){
        return this.scrollPane;
    }
}
