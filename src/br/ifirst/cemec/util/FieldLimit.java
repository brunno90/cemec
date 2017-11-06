package br.ifirst.cemec.util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Iagho
 */
public class FieldLimit extends PlainDocument {

    private int limit;
    // optional uppercase conversion
    private boolean toUppercase = false;

    public FieldLimit(int i) {
        super();
        this.limit = i;
    }

    public FieldLimit(int i, boolean upper) {
        super();
        this.limit = i;
        toUppercase = upper;
    }

    @Override
    public void insertString(int offset, String str, AttributeSet attr)
            throws BadLocationException {
        if (str == null) {
            return;
        }
        if ((getLength() + str.length()) <= limit) {
            if (toUppercase) {
                str = str.toUpperCase();
            }
            super.insertString(offset, str, attr);
        }
    }
}
