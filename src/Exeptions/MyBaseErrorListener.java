package Exeptions;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import javax.swing.*;

public class MyBaseErrorListener extends BaseErrorListener {

    DefaultListModel defaultListModel;

    public  MyBaseErrorListener(JList list){
        defaultListModel = (DefaultListModel) list.getModel();
    }

    public void syntaxError(Recognizer<?,?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e){
        String Mymsg="Error en  " + line + ":" + (charPositionInLine+1) + " " + msg;
        defaultListModel.addElement(Mymsg);
    }

}
