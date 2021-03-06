package Exeptions;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.IntervalSet;

import javax.swing.*;
import java.util.ArrayList;

public class MyException extends DefaultErrorStrategy {

    DefaultListModel defaultListModel;

    public boolean error = false;




    public MyException(JList list){
        super();
        defaultListModel = (DefaultListModel) list.getModel();
    }

    public boolean hasErrors ( )
    {
        return this.error;
    }

    @Override
    public void reset(Parser recognizer) {
        super.reset(recognizer);
    }

    @Override
    protected void beginErrorCondition(Parser recognizer) {
        super.beginErrorCondition(recognizer);
    }

    @Override
    public boolean inErrorRecoveryMode(Parser recognizer) {
        return super.inErrorRecoveryMode(recognizer);
    }

    @Override
    protected void endErrorCondition(Parser recognizer) {
        super.endErrorCondition(recognizer);

    }

    @Override
    public void reportMatch(Parser recognizer) {
        super.reportMatch(recognizer);
    }

    @Override
    public void reportError(Parser recognizer, RecognitionException e) {
        super.reportError(recognizer, e);
    }

    @Override
    public void recover(Parser recognizer, RecognitionException e) {
        super.recover(recognizer, e);
    }

    @Override
    public void sync(Parser recognizer) throws RecognitionException {
        super.sync(recognizer);
    }

    @Override
    protected void reportNoViableAlternative(Parser recognizer, NoViableAltException e) {
        TokenStream tokens = recognizer.getInputStream();
        String input;
        if(tokens != null) {
            if(e.getStartToken().getType() == -1) {
                input = "<EOF>";
            } else {
                input = tokens.getText(e.getStartToken(), e.getOffendingToken());
            }
        } else {
            input = "<entrada desconocida>";
        }

        String msg = "No hay una alternativa viable para " + this.escapeWSAndQuote(input);
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);

    }

    @Override
    protected void reportInputMismatch(Parser recognizer, InputMismatchException e) {
        String msg = "No se pudo hacer match con la entrada " + this.getTokenErrorDisplay(e.getOffendingToken())
                + ", se esperaba " + e.getExpectedTokens().toString(recognizer.getVocabulary());
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }

    @Override
    protected void reportFailedPredicate(Parser recognizer, FailedPredicateException e) {
        String ruleName = recognizer.getRuleNames()[recognizer.getContext().getRuleIndex()];
        String msg = "Regla " + ruleName + " " + e.getMessage()
                + " en "+ String.valueOf(e.getOffendingToken().getLine())+" : "
                +String.valueOf(e.getOffendingToken().getCharPositionInLine()+1);
        defaultListModel.addElement(msg);
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);

    }

    @Override
    protected void reportUnwantedToken(Parser recognizer) {
        if(!this.inErrorRecoveryMode(recognizer)) {
            this.beginErrorCondition(recognizer);
            Token t = recognizer.getCurrentToken();
            String tokenName = this.getTokenErrorDisplay(t);
            IntervalSet expecting = this.getExpectedTokens(recognizer);
            String msg = "Entrada extraña " + tokenName + ", se esperaba " + expecting.toString(recognizer.getVocabulary())
                    + " "+ String.valueOf(t.getLine())+" : "
                    +String.valueOf(t.getCharPositionInLine()+1);
            defaultListModel.addElement(msg);
            recognizer.notifyErrorListeners(t, msg, (RecognitionException)null);
        }
    }

    @Override
    protected void reportMissingToken(Parser recognizer) {
        if(!this.inErrorRecoveryMode(recognizer)) {
            this.beginErrorCondition(recognizer);
            Token t = recognizer.getCurrentToken();
            IntervalSet expecting = this.getExpectedTokens(recognizer);
            String msg = "Falta " + expecting.toString(recognizer.getVocabulary());
            recognizer.notifyErrorListeners(t, msg, (RecognitionException)null);
        }
    }

    @Override
    public Token recoverInline(Parser recognizer) throws RecognitionException {
        return super.recoverInline(recognizer);

    }

    @Override
    protected boolean singleTokenInsertion(Parser recognizer) {
        return super.singleTokenInsertion(recognizer);
    }

    @Override
    protected Token singleTokenDeletion(Parser recognizer) {
        this.error = true;
        return super.singleTokenDeletion(recognizer);
    }

    @Override
    protected Token getMissingSymbol(Parser recognizer) {
        this.error = true;
        return super.getMissingSymbol(recognizer);
    }

    @Override
    protected IntervalSet getExpectedTokens(Parser recognizer) {
        this.error = true;
        return super.getExpectedTokens(recognizer);
    }

    @Override
    protected String getTokenErrorDisplay(Token t) {
        this.error = true;
        return super.getTokenErrorDisplay(t);
    }

    @Override
    protected String getSymbolText(Token symbol) {

        this.error = true;
        return super.getSymbolText(symbol);
    }

    @Override
    protected int getSymbolType(Token symbol) {

        this.error = true;
        return super.getSymbolType(symbol);
    }

    @Override
    protected String escapeWSAndQuote(String s) {

        this.error = true;
        return super.escapeWSAndQuote(s);
    }

    @Override
    protected IntervalSet getErrorRecoverySet(Parser recognizer) {

        this.error = true;
        return super.getErrorRecoverySet(recognizer);
    }

    @Override
    protected void consumeUntil(Parser recognizer, IntervalSet set) {

        this.error = true;
        super.consumeUntil(recognizer, set);
    }
}



