package Exeptions;

import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import javax.swing.*;

public class MyConsoleErrorListener extends ConsoleErrorListener {

    DefaultListModel defaultListModel;

    public MyConsoleErrorListener(JList list) {
        super();
        defaultListModel = (DefaultListModel) list.getModel();
    }

    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        String Mymsg;
        Mymsg="Error de sintaxis en  " + line + ":" + (charPositionInLine+1) + " " + msg;
        defaultListModel.addElement(Mymsg);

    }

}

