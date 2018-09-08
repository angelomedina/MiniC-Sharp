package Exeptions;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import javax.swing.*;
import java.util.ArrayList;

public class MyBaseErrorListener extends BaseErrorListener {

    DefaultListModel defaultListModel;
    public ArrayList<String> errorMsgs = new ArrayList<String>();

    public  MyBaseErrorListener(JList list){
        defaultListModel = (DefaultListModel) list.getModel();
    }

    public void syntaxError(Recognizer<?,?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e){
        String Mymsg="Error en  " + line + ":" + (charPositionInLine+1) + " " + msg;
        defaultListModel.addElement(Mymsg);
    }
    public boolean hasErrors ( )
    {
        return this.errorMsgs.size() > 0;
    }

}
