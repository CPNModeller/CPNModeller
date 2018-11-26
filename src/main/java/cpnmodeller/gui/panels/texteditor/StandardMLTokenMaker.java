package cpnmodeller.gui.panels.texteditor;

import java.io.*;
import javax.swing.text.Segment;

import org.fife.ui.rsyntaxtextarea.*;

public class StandardMLTokenMaker extends AbstractJFlexTokenMaker {

    /**
     * This character denotes the end of file
     */
    public static final int YYEOF = -1;

    /**
     * initial size of the lookahead buffer
     */
    private static final int ZZ_BUFFERSIZE = 16384;

    /**
     * lexical states
     */
    public static final int YYINITIAL = 0;
    public static final int MLC = 1;

    /**
     * Translates characters to character classes
     */
    private static final String ZZ_CMAP_PACKED =
            "\11\0\1\17\1\7\1\0\1\17\1\15\22\0\1\17\1\27\1\14" +
                    "\1\16\1\1\1\27\1\27\1\6\1\20\1\22\1\21\1\25\1\27" +
                    "\1\25\1\23\1\31\1\4\3\4\4\4\2\3\1\41\1\27\1\15" +
                    "\1\27\1\15\1\27\1\16\6\5\24\1\1\30\1\10\1\30\1\47" +
                    "\1\2\1\0\1\46\1\13\1\5\1\44\1\24\1\36\1\1\1\32" +
                    "\1\37\2\1\1\40\1\1\1\43\1\1\1\34\1\1\1\12\1\35" +
                    "\1\33\1\11\1\45\1\42\3\1\1\26\1\15\1\26\1\27\uff81\0";

    /**
     * Translates characters to character classes
     */
    private static final char[] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

    /**
     * Translates DFA states to action switch labels.
     */
    private static final int[] ZZ_ACTION = zzUnpackAction();

    private static final String ZZ_ACTION_PACKED_0 =
            "\2\0\2\1\1\2\1\3\1\4\1\5\1\6\1\7" +
                    "\1\6\11\1\1\10\1\11\4\10\1\0\1\12\1\0" +
                    "\1\12\2\4\1\13\1\14\1\15\4\1\1\16\2\1" +
                    "\1\17\5\0\1\15\1\0\1\4\1\20\1\4\1\1" +
                    "\5\0\1\4\2\0\1\21\1\0\1\4\3\0\1\4";

    private static int[] zzUnpackAction() {
        int[] result = new int[69];
        int offset = 0;
        offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackAction(String packed, int offset, int[] result) {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            do result[j++] = value; while (--count > 0);
        }
        return j;
    }


    /**
     * Translates a state to a row index in the transition table
     */
    private static final int[] ZZ_ROWMAP = zzUnpackRowMap();

    private static final String ZZ_ROWMAP_PACKED_0 =
            "\0\0\0\50\0\120\0\170\0\240\0\120\0\310\0\360" +
                    "\0\u0118\0\120\0\120\0\u0140\0\u0168\0\u0190\0\u01b8\0\u01e0" +
                    "\0\u0208\0\u0230\0\u0258\0\u0280\0\u02a8\0\120\0\u02d0\0\u02f8" +
                    "\0\u0320\0\u0348\0\u0370\0\u0398\0\u0140\0\u03c0\0\u03e8\0\u0410" +
                    "\0\120\0\120\0\u0438\0\u0460\0\u0488\0\u04b0\0\u04d8\0\170" +
                    "\0\u0500\0\u0528\0\120\0\u0550\0\u0578\0\u05a0\0\u05c8\0\u05f0" +
                    "\0\u0618\0\u0640\0\u0668\0\120\0\u0690\0\u06b8\0\u06e0\0\u0708" +
                    "\0\u0730\0\u0758\0\u0780\0\u07a8\0\u07d0\0\u07f8\0\u0820\0\u0848" +
                    "\0\u0870\0\u0898\0\u0820\0\u08c0\0\u08e8";

    private static int[] zzUnpackRowMap() {
        int[] result = new int[69];
        int offset = 0;
        offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackRowMap(String packed, int offset, int[] result) {
        int i = 0;  /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int high = packed.charAt(i++) << 16;
            result[j++] = high | packed.charAt(i++);
        }
        return j;
    }

    /**
     * The transition table of the DFA
     */
    private static final int[] ZZ_TRANS = zzUnpackTrans();

    private static final String ZZ_TRANS_PACKED_0 =
            "\1\3\2\4\2\5\1\4\1\3\1\6\1\3\3\4" +
                    "\1\7\2\3\1\10\1\11\1\12\1\13\1\14\1\15" +
                    "\1\12\1\13\1\3\1\13\1\12\1\4\1\16\2\4" +
                    "\1\17\1\20\1\21\1\22\3\4\1\23\1\4\1\24" +
                    "\7\25\1\26\11\25\1\27\10\25\1\30\3\25\1\31" +
                    "\3\25\1\32\5\25\51\0\5\4\2\0\1\33\3\4" +
                    "\10\0\1\4\5\0\7\4\1\0\5\4\1\0\3\34" +
                    "\2\5\1\34\2\0\4\34\2\0\1\34\4\0\1\35" +
                    "\1\36\5\0\7\34\1\0\5\34\1\0\7\7\1\37" +
                    "\1\40\3\7\1\41\33\7\17\0\1\10\51\0\1\42" +
                    "\31\0\2\43\44\0\5\4\2\0\1\33\3\4\10\0" +
                    "\1\4\5\0\6\4\1\44\1\0\1\4\1\45\3\4" +
                    "\2\0\5\4\2\0\1\33\3\4\10\0\1\4\5\0" +
                    "\1\46\6\4\1\0\5\4\2\0\5\4\2\0\1\33" +
                    "\1\47\2\4\10\0\1\4\5\0\7\4\1\0\5\4" +
                    "\2\0\5\4\2\0\1\33\3\4\10\0\1\4\5\0" +
                    "\4\4\1\50\2\4\1\0\1\4\1\50\3\4\2\0" +
                    "\5\4\2\0\1\33\3\4\10\0\1\51\5\0\7\4" +
                    "\1\0\5\4\42\0\1\12\7\0\5\4\2\0\1\33" +
                    "\3\4\10\0\1\4\5\0\7\4\1\0\4\4\1\52" +
                    "\50\0\1\12\7\25\1\0\11\25\1\0\10\25\1\0" +
                    "\3\25\1\0\3\25\1\0\5\25\22\0\1\53\60\0" +
                    "\1\54\47\0\1\55\3\0\1\56\52\0\1\57\16\0" +
                    "\1\60\36\0\6\34\2\0\4\34\2\0\1\34\5\0" +
                    "\1\34\5\0\7\34\1\0\5\34\1\0\3\34\2\61" +
                    "\1\34\2\0\4\34\2\0\1\34\5\0\1\34\1\62" +
                    "\4\0\7\34\1\0\5\34\1\0\10\37\1\63\3\37" +
                    "\1\64\37\37\1\7\1\37\1\7\1\0\1\7\1\65" +
                    "\3\7\16\37\1\7\2\37\1\7\4\37\1\7\4\37" +
                    "\3\34\2\43\1\34\2\0\4\34\2\0\1\34\5\0" +
                    "\1\36\5\0\7\34\1\0\5\34\2\0\5\4\2\0" +
                    "\1\33\3\4\10\0\1\4\5\0\3\4\1\66\3\4" +
                    "\1\0\5\4\2\0\5\4\2\0\1\33\3\4\10\0" +
                    "\1\4\5\0\7\4\1\0\2\4\1\50\2\4\2\0" +
                    "\5\4\2\0\1\33\3\4\10\0\1\47\5\0\7\4" +
                    "\1\0\5\4\2\0\5\4\2\0\1\33\3\4\10\0" +
                    "\1\4\5\0\7\4\1\0\1\4\1\50\3\4\2\0" +
                    "\5\4\2\0\1\33\3\4\10\0\1\4\5\0\1\4" +
                    "\1\50\5\4\1\0\5\4\2\0\5\4\2\0\1\33" +
                    "\3\4\10\0\1\4\5\0\6\4\1\50\1\0\5\4" +
                    "\34\0\1\67\50\0\1\70\53\0\1\71\51\0\1\72" +
                    "\10\0\3\73\5\0\1\73\10\0\1\73\11\0\1\73" +
                    "\5\0\1\73\1\0\1\73\1\0\3\34\2\61\1\34" +
                    "\2\0\4\34\2\0\1\34\5\0\1\34\5\0\7\34" +
                    "\1\0\5\34\4\0\2\61\43\0\7\37\1\0\43\37" +
                    "\3\74\2\37\1\63\2\37\1\74\1\64\7\37\1\74" +
                    "\11\37\1\74\5\37\1\74\1\37\1\74\1\37\1\0" +
                    "\5\4\2\0\1\33\3\4\10\0\1\50\5\0\7\4" +
                    "\1\0\5\4\35\0\1\75\54\0\1\76\32\0\1\70" +
                    "\46\0\1\77\27\0\3\100\5\0\1\100\10\0\1\100" +
                    "\11\0\1\100\5\0\1\100\1\0\1\100\1\0\3\37" +
                    "\3\101\2\37\1\63\2\37\1\101\1\64\7\37\1\101" +
                    "\11\37\1\101\5\37\1\101\1\37\1\101\1\37\35\0" +
                    "\1\70\3\0\1\76\37\0\1\102\17\0\1\77\1\103" +
                    "\3\77\1\103\2\0\3\77\2\0\1\103\1\0\4\103" +
                    "\1\77\1\103\1\0\2\103\10\77\1\103\5\77\4\0" +
                    "\3\104\5\0\1\104\10\0\1\104\11\0\1\104\5\0" +
                    "\1\104\1\0\1\104\1\0\3\37\3\105\2\37\1\63" +
                    "\2\37\1\105\1\64\7\37\1\105\11\37\1\105\5\37" +
                    "\1\105\1\37\1\105\1\37\31\0\1\77\21\0\3\4" +
                    "\5\0\1\4\10\0\1\4\11\0\1\4\5\0\1\4" +
                    "\1\0\1\4\1\0\3\37\3\7\2\37\1\63\2\37" +
                    "\1\7\1\64\7\37\1\7\11\37\1\7\5\37\1\7" +
                    "\1\37\1\7\1\37";

    private static int[] zzUnpackTrans() {
        int[] result = new int[2320];
        int offset = 0;
        offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackTrans(String packed, int offset, int[] result) {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            value--;
            do result[j++] = value; while (--count > 0);
        }
        return j;
    }


    /* error codes */
    private static final int ZZ_UNKNOWN_ERROR = 0;
    private static final int ZZ_NO_MATCH = 1;
    private static final int ZZ_PUSHBACK_2BIG = 2;

    /* error messages for the codes above */
    private static final String ZZ_ERROR_MSG[] = {
            "Unkown internal scanner error",
            "Error: could not match input",
            "Error: pushback value was too large"
    };

    /**
     * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
     */
    private static final int[] ZZ_ATTRIBUTE = zzUnpackAttribute();

    private static final String ZZ_ATTRIBUTE_PACKED_0 =
            "\2\0\1\11\2\1\1\11\3\1\2\11\12\1\1\11" +
                    "\4\1\1\0\1\1\1\0\3\1\2\11\10\1\1\11" +
                    "\5\0\1\1\1\0\1\1\1\11\2\1\5\0\1\1" +
                    "\2\0\1\1\1\0\1\1\3\0\1\1";

    private static int[] zzUnpackAttribute() {
        int[] result = new int[69];
        int offset = 0;
        offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackAttribute(String packed, int offset, int[] result) {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            do result[j++] = value; while (--count > 0);
        }
        return j;
    }

    /**
     * the input device
     */
    private Reader zzReader;

    /**
     * the current state of the DFA
     */
    private int zzState;

    /**
     * the current lexical state
     */
    private int zzLexicalState = YYINITIAL;

    /**
     * this buffer contains the current text to be matched and is
     * the source of the yytext() string
     */
    private char zzBuffer[];

    /**
     * the textposition at the last accepting state
     */
    private int zzMarkedPos;

    /**
     * the textposition at the last state to be included in yytext
     */
    private int zzPushbackPos;

    /**
     * the current text position in the buffer
     */
    private int zzCurrentPos;

    /**
     * startRead marks the beginning of the yytext() string in the buffer
     */
    private int zzStartRead;

    /**
     * endRead marks the last character in the buffer, that has been read
     * from input
     */
    private int zzEndRead;

    /**
     * number of newlines encountered up to the start of the matched text
     */
    private int yyline;

    /**
     * the number of characters up to the start of the matched text
     */
    private int yychar;

    /**
     * the number of characters from the last newline up to the start of the
     * matched text
     */
    private int yycolumn;

    /**
     * zzAtBOL == true <=> the scanner is currently at the beginning of a line
     */
    private boolean zzAtBOL = true;

    /**
     * zzAtEOF == true <=> the scanner is at the EOF
     */
    private boolean zzAtEOF;

    /* user code: */


    /**
     * Constructor.  This must be here because JFlex does not generate a
     * no-parameter constructor.
     */
    public StandardMLTokenMaker() {
    }


    /**
     * Adds the token specified to the current linked list of tokens.
     *
     * @param tokenType The token's type.
     * @see #addToken(int, int, int)
     */
    private void addHyperlinkToken(int start, int end, int tokenType) {
        int so = start + offsetShift;
        addToken(zzBuffer, start, end, tokenType, so, true);
    }


    /**
     * Adds the token specified to the current linked list of tokens.
     *
     * @param tokenType The token's type.
     */
    private void addToken(int tokenType) {
        addToken(zzStartRead, zzMarkedPos - 1, tokenType);
    }


    /**
     * Adds the token specified to the current linked list of tokens.
     *
     * @param tokenType The token's type.
     * @see #addHyperlinkToken(int, int, int)
     */
    private void addToken(int start, int end, int tokenType) {
        int so = start + offsetShift;
        addToken(zzBuffer, start, end, tokenType, so, false);
    }


    /**
     * Adds the token specified to the current linked list of tokens.
     *
     * @param array       The character array.
     * @param start       The starting offset in the array.
     * @param end         The ending offset in the array.
     * @param tokenType   The token's type.
     * @param startOffset The offset in the document at which this token
     *                    occurs.
     * @param hyperlink   Whether this token is a hyperlink.
     */
    public void addToken(char[] array, int start, int end, int tokenType,
                         int startOffset, boolean hyperlink) {
        super.addToken(array, start, end, tokenType, startOffset, hyperlink);
        zzStartRead = zzMarkedPos;
    }


    /**
     * {@inheritDoc}
     */
    public String[] getLineCommentStartAndEnd(int languageIndex) {
        return null;
    }


    /**
     * Returns the first token in the linked list of tokens generated
     * from <code>text</code>.  This method must be implemented by
     * subclasses so they can correctly implement syntax highlighting.
     *
     * @param text             The text from which to get tokens.
     * @param initialTokenType The token type we should start with.
     * @param startOffset      The offset into the document at which
     *                         <code>text</code> starts.
     * @return The first <code>Token</code> in a linked list representing
     * the syntax highlighted text.
     */
    public Token getTokenList(Segment text, int initialTokenType, int startOffset) {

        resetTokenList();
        this.offsetShift = -text.offset + startOffset;

        // Start off in the proper state.
        int state = Token.NULL;
        switch (initialTokenType) {
            case Token.COMMENT_MULTILINE:
                state = MLC;
                start = text.offset;
                break;

            /* No documentation comments */
            default:
                state = Token.NULL;
        }

        s = text;
        try {
            yyreset(zzReader);
            yybegin(state);
            return yylex();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return new TokenImpl();
        }

    }


    /**
     * Refills the input buffer.
     *
     * @return <code>true</code> if EOF was reached, otherwise
     * <code>false</code>.
     */
    private boolean zzRefill() {
        return zzCurrentPos >= s.offset + s.count;
    }


    /**
     * Resets the scanner to read from a new input stream.
     * Does not close the old reader.
     * <p>
     * All internal variables are reset, the old input stream
     * <b>cannot</b> be reused (internal buffer is discarded and lost).
     * Lexical state is set to <tt>YY_INITIAL</tt>.
     *
     * @param reader the new input stream
     */
    public final void yyreset(Reader reader) {
        // 's' has been updated.
        zzBuffer = s.array;
        /*
         * We replaced the line below with the two below it because zzRefill
         * no longer "refills" the buffer (since the way we do it, it's always
         * "full" the first time through, since it points to the segment's
         * array).  So, we assign zzEndRead here.
         */
        //zzStartRead = zzEndRead = s.offset;
        zzStartRead = s.offset;
        zzEndRead = zzStartRead + s.count - 1;
        zzCurrentPos = zzMarkedPos = zzPushbackPos = s.offset;
        zzLexicalState = YYINITIAL;
        zzReader = reader;
        zzAtBOL = true;
        zzAtEOF = false;
    }


    /**
     * Creates a new scanner
     * There is also a java.io.InputStream version of this constructor.
     *
     * @param in the java.io.Reader to read input from.
     */
    public StandardMLTokenMaker(Reader in) {
        this.zzReader = in;
    }

    /**
     * Creates a new scanner.
     * There is also java.io.Reader version of this constructor.
     *
     * @param in the java.io.Inputstream to read input from.
     */
    public StandardMLTokenMaker(InputStream in) {
        this(new InputStreamReader(in));
    }

    /**
     * Unpacks the compressed character translation table.
     *
     * @param packed the packed character translation table
     * @return the unpacked character translation table
     */
    private static char[] zzUnpackCMap(String packed) {
        char[] map = new char[0x10000];
        int i = 0;  /* index in packed string  */
        int j = 0;  /* index in unpacked array */
        while (i < 140) {
            int count = packed.charAt(i++);
            char value = packed.charAt(i++);
            do map[j++] = value; while (--count > 0);
        }
        return map;
    }


    /**
     * Closes the input stream.
     */
    public final void yyclose() throws IOException {
        zzAtEOF = true;            /* indicate end of file */
        zzEndRead = zzStartRead;  /* invalidate buffer    */

        if (zzReader != null)
            zzReader.close();
    }


    /**
     * Enters a new lexical state
     *
     * @param newState the new lexical state
     */
    public final void yybegin(int newState) {
        zzLexicalState = newState;
    }

    /**
     * Returns the text matched by the current regular expression.
     */
    public final String yytext() {
        return new String(zzBuffer, zzStartRead, zzMarkedPos - zzStartRead);
    }

    /**
     * Returns the character at position <tt>pos</tt> from the
     * matched text.
     * <p>
     * It is equivalent to yytext().charAt(pos), but faster
     *
     * @param pos the position of the character to fetch.
     *            A value from 0 to yylength()-1.
     * @return the character at position pos
     */
    public final char yycharat(int pos) {
        return zzBuffer[zzStartRead + pos];
    }

    /**
     * Returns the length of the matched text region.
     */
    public final int yylength() {
        return zzMarkedPos - zzStartRead;
    }

    /**
     * Reports an error that occured while scanning.
     * <p>
     * In a wellformed scanner (no or only correct usage of
     * yypushback(int) and a match-all fallback rule) this method
     * will only be called with things that "Can't Possibly Happen".
     * If this method is called, something is seriously wrong
     * (e.g. a JFlex bug producing a faulty scanner etc.).
     * <p>
     * Usual syntax/scanner level error handling should be done
     * in error fallback rules.
     *
     * @param errorCode the code of the errormessage to display
     */
    private void zzScanError(int errorCode) {
        String message;
        try {
            message = ZZ_ERROR_MSG[errorCode];
        } catch (ArrayIndexOutOfBoundsException e) {
            message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
        }

        throw new Error(message);
    }

    /**
     * Pushes the specified amount of characters back into the input stream.
     * <p>
     * They will be read again by then next call of the scanning method
     *
     * @param number the number of characters to be read again.
     *               This number must not be greater than yylength()!
     */
    public void yypushback(int number) {
        if (number > yylength())
            zzScanError(ZZ_PUSHBACK_2BIG);

        zzMarkedPos -= number;
    }

    /**
     * Resumes scanning until the next regular expression is matched,
     * the end of input is encountered or an I/O-Error occurs.
     *
     * @return the next token
     * @throws IOException if any I/O-Error occurs
     */
    public Token yylex() throws IOException {
        int zzInput;
        int zzAction;

        // cached fields:
        int zzCurrentPosL;
        int zzMarkedPosL;
        int zzEndReadL = zzEndRead;
        char[] zzBufferL = zzBuffer;
        char[] zzCMapL = ZZ_CMAP;

        int[] zzTransL = ZZ_TRANS;
        int[] zzRowMapL = ZZ_ROWMAP;
        int[] zzAttrL = ZZ_ATTRIBUTE;

        while (true) {
            zzMarkedPosL = zzMarkedPos;

            zzAction = -1;

            zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

            zzState = zzLexicalState;


            zzForAction:
            {
                while (true) {

                    if (zzCurrentPosL < zzEndReadL)
                        zzInput = zzBufferL[zzCurrentPosL++];
                    else if (zzAtEOF) {
                        zzInput = YYEOF;
                        break zzForAction;
                    } else {
                        // store back cached positions
                        zzCurrentPos = zzCurrentPosL;
                        zzMarkedPos = zzMarkedPosL;
                        boolean eof = zzRefill();
                        // get translated positions and possibly new buffer
                        zzCurrentPosL = zzCurrentPos;
                        zzMarkedPosL = zzMarkedPos;
                        zzBufferL = zzBuffer;
                        zzEndReadL = zzEndRead;
                        if (eof) {
                            zzInput = YYEOF;
                            break zzForAction;
                        } else {
                            zzInput = zzBufferL[zzCurrentPosL++];
                        }
                    }
                    int zzNext = zzTransL[zzRowMapL[zzState] + zzCMapL[zzInput]];
                    if (zzNext == -1) break zzForAction;
                    zzState = zzNext;

                    int zzAttributes = zzAttrL[zzState];
                    if ((zzAttributes & 1) == 1) {
                        zzAction = zzState;
                        zzMarkedPosL = zzCurrentPosL;
                        if ((zzAttributes & 8) == 8) break zzForAction;
                    }

                }
            }

            // store back cached position
            zzMarkedPos = zzMarkedPosL;

            switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
                case 14: {
                    addToken(Token.RESERVED_WORD);
                }
                case 18:
                    break;
                case 1: {
                    addToken(Token.IDENTIFIER);
                }
                case 19:
                    break;
                case 15: {
                    yybegin(YYINITIAL);
                    addToken(start, zzStartRead + 2 - 1, Token.COMMENT_MULTILINE);
                }
                case 20:
                    break;
                case 13: {
                    addToken(Token.LITERAL_NUMBER_FLOAT);
                }
                case 21:
                    break;
                case 11: {
                    addToken(Token.LITERAL_STRING_DOUBLE_QUOTE);
                }
                case 22:
                    break;
                case 17: {
                    int temp = zzStartRead;
                    addToken(start, zzStartRead - 1, Token.COMMENT_MULTILINE);
                    addHyperlinkToken(temp, zzMarkedPos - 1, Token.COMMENT_MULTILINE);
                    start = zzMarkedPos;
                }
                case 23:
                    break;
                case 5: {
                    addToken(Token.WHITESPACE);
                }
                case 24:
                    break;
                case 10: {
                    addToken(Token.ERROR_NUMBER_FORMAT);
                }
                case 25:
                    break;
                case 7: {
                    addToken(Token.OPERATOR);
                }
                case 26:
                    break;
                case 2: {
                    addToken(Token.LITERAL_NUMBER_DECIMAL_INT);
                }
                case 27:
                    break;
                case 9: {
                    addToken(start, zzStartRead - 1, Token.COMMENT_MULTILINE);
                    return firstToken;
                }
                case 28:
                    break;
                case 4: {
                    addToken(Token.ERROR_STRING_DOUBLE);
                    addNullToken();
                    return firstToken;
                }
                case 29:
                    break;
                case 3: {
                    addNullToken();
                    return firstToken;
                }
                case 30:
                    break;
                case 12: {
                    start = zzMarkedPos - 2;
                    yybegin(MLC);
                }
                case 31:
                    break;
                case 16: {
                    addToken(Token.ERROR_STRING_DOUBLE);
                }
                case 32:
                    break;
                case 8: {
                }
                case 33:
                    break;
                case 6: {
                    addToken(Token.SEPARATOR);
                }
                case 34:
                    break;
                default:
                    if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
                        zzAtEOF = true;
                        switch (zzLexicalState) {
                            case YYINITIAL: {
                                addNullToken();
                                return firstToken;
                            }
                            case 70:
                                break;
                            case MLC: {
                                addToken(start, zzStartRead - 1, Token.COMMENT_MULTILINE);
                                return firstToken;
                            }
                            case 71:
                                break;
                            default:
                                return null;
                        }
                    } else {
                        zzScanError(ZZ_NO_MATCH);
                    }
            }
        }
    }
}
