package cpnmodeller.gui.panels.texteditor;

import javax.swing.text.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class StandardMLDocument extends DefaultStyledDocument {

    private static final String KEYWORD_REGEX;
    private static final AttributeSet REGULAR_ATTR;
    private static final AttributeSet KEYWORD_ATTR;

    static {
        List<String> keywords = new LinkedList<>();
        keywords.add("val");
        keywords.add("fun");
        keywords.add("let");
        keywords.add("in");
        keywords.add("end");
        keywords.add("if");
        keywords.add("else");

        StringBuilder builder = new StringBuilder("(\\W)*(");
        for (int i = 0; i < keywords.size(); i++) {
            builder.append(keywords.get(i));

            if (i < keywords.size() - 1) {
                builder.append("|");
            }
        }

        builder.append(")");

        KEYWORD_REGEX = builder.toString();

        final StyleContext cont = StyleContext.getDefaultStyleContext();
        AttributeSet attrKeyword = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, Color.RED);
        KEYWORD_ATTR = cont.addAttribute(attrKeyword, StyleConstants.Bold, true);
        REGULAR_ATTR = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, Color.BLACK);
    }

    @Override
    public void insertString (int offset, String str, AttributeSet a) throws BadLocationException {
        super.insertString(offset, str, a);

        String text = getText(0, getLength());
        int before = findLastNonWordChar(text, offset);
        if (before < 0) before = 0;
        int after = findFirstNonWordChar(text, offset + str.length());
        int wordL = before;
        int wordR = before;

        while (wordR <= after) {
            if (wordR == after || String.valueOf(text.charAt(wordR)).matches("\\W")) {
                if (text.substring(wordL, wordR).matches(KEYWORD_REGEX))
                    setCharacterAttributes(wordL, wordR - wordL, KEYWORD_ATTR, false);
                else
                    setCharacterAttributes(wordL, wordR - wordL, REGULAR_ATTR, false);
                wordL = wordR;
            }
            wordR++;
        }
    }

    @Override
    public void remove (int offs, int len) throws BadLocationException {
        super.remove(offs, len);

        String text = getText(0, getLength());
        int before = findLastNonWordChar(text, offs);
        if (before < 0) before = 0;
        int after = findFirstNonWordChar(text, offs);

        if (text.substring(before, after).matches(KEYWORD_REGEX)) {
            setCharacterAttributes(before, after - before, KEYWORD_ATTR, false);
        } else {
            setCharacterAttributes(before, after - before, REGULAR_ATTR, false);
        }
    }

    private int findLastNonWordChar (String text, int index) {
        while (--index >= 0) {
            if (String.valueOf(text.charAt(index)).matches("\\W")) {
                break;
            }
        }
        return index;
    }

    private int findFirstNonWordChar (String text, int index) {
        while (index < text.length()) {
            if (String.valueOf(text.charAt(index)).matches("\\W")) {
                break;
            }
            index++;
        }
        return index;
    }
}
