package cpnmodeller.gui.panels.texteditor;

import org.fife.ui.rsyntaxtextarea.AbstractTokenMakerFactory;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.TokenMakerFactory;
import org.fife.ui.rtextarea.RTextScrollPane;

import javax.swing.*;
import java.awt.*;

public final class TextEditorPanel extends JPanel {

    private final RSyntaxTextArea textArea = new RSyntaxTextArea(20, 60);

    public TextEditorPanel() {
        setLayout(new BorderLayout());

        AbstractTokenMakerFactory atmf = (AbstractTokenMakerFactory) TokenMakerFactory.getDefaultInstance();
        atmf.putMapping("text/standardml", StandardMLTokenMaker.class.getName());
        textArea.setSyntaxEditingStyle("text/standardml");

        RTextScrollPane sp = new RTextScrollPane(textArea);
        add(sp);

        setPreferredSize(new Dimension(600, 500));
    }
}
