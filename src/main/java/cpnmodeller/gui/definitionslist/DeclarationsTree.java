package cpnmodeller.gui.definitionslist;

import cpnmodeller.declarations.Declarations;
import cpnmodeller.declarations.Globref;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.util.Set;

public class DeclarationsTree{

    private Declarations declarations;
    private JTree declarationsTree;
    private DefaultMutableTreeNode top;


    public DeclarationsTree(Declarations declarations){
        this.declarations = declarations;
        top = new DefaultMutableTreeNode("Declarations");
        createNodes(top);
        this.declarationsTree = new JTree(top);
    }

    private void createNodes(DefaultMutableTreeNode top) {

        DefaultMutableTreeNode parameters = new DefaultMutableTreeNode("Paramters");
        DefaultMutableTreeNode types = new DefaultMutableTreeNode("Types");
        DefaultMutableTreeNode variables = new DefaultMutableTreeNode("Variables");
        DefaultMutableTreeNode functions = new DefaultMutableTreeNode("Functions");
        top.add(parameters);
        top.add(types);
        top.add(variables);
        top.add(functions);

        try{
            Set<Globref> parametersSet = declarations.getParameters();
            for(Globref globref : parametersSet){
                parameters.add(new DefaultMutableTreeNode(globref.toString()));
            }
        }
        catch(Exception e){
            System.out.println("empty set");
            return;
        }
    }

    public JTree getJTree(){
        return this.declarationsTree;
    }

    public void setDeclarations(Declarations declarations){
        this.declarations = declarations;
    }

    public void addDefinition(){

    }

    public void removeDefinition(){

    }

    public JTree getDeclarationsTree(){
        return this.declarationsTree;
    }


}
