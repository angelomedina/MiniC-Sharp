package Vista;

import Exeptions.*;
import Antlr.MyParser;
import Antlr.Scanner;
import Modelo.Archivos;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Arrieta on 19/3/2017.
 */
public class Principal extends  JFrame implements ActionListener {
    Scanner scanner = null;
    MyParser parser = null;



    int tab=1;
    private JMenuBar menuBar;
    private JMenu archivo;
    private JMenuItem abrir;
    private JMenuItem nuevo;
    private JMenuItem guardar;
    private JMenuItem guardarComo;
    private JMenuItem salir;

    private JMenu ayuda;
    private JMenuItem acercaDe;

    private JMenu edicion;
    private JMenuItem copiar;
    private JMenuItem cortar;
    private JMenuItem pegar;

    private JMenu formato;
    private JCheckBoxMenuItem ajusteLinea;


    private JMenu vista;
    private JCheckBoxMenuItem numeroLinea;

    private JPopupMenu popupMenu;
    private JMenuItem pCopiar;
    private JMenuItem pPegar;
    private JMenuItem pCortar;

    private int contError = 0;

    Archivos file;
    private int numLineas = 1, numHoja = 1, guardado = 0, abierto = 0;
    private Vector<String> filas = new Vector<String>();

    public  Principal (){
        initMenus();
        initComponents();
    }
    private void ajusteLineaStateChanged(ChangeEvent evt) {
        for (int i=0;i<tabbedPane.getTabCount();i++){
            JPanel panel = (JPanel)tabbedPane.getComponentAt(i);
            JScrollPane scrollPane=(JScrollPane)panel.getComponent(0);
            JViewport viewport = scrollPane.getViewport();
            JPanel subPanel=(JPanel) viewport.getView();
            JTextArea textArea= (JTextArea) subPanel.getComponent(1);
            if(this.ajusteLinea.isSelected()) {
                textArea.setLineWrap(true);
            } else {
                textArea.setLineWrap(false);
            }
        }
    }
    private void initMenus(){
        menuBar=new JMenuBar();

        archivo=new JMenu("Archivo");
        abrir= new JMenuItem("Abrir");
        nuevo=new JMenuItem("Nuevo");
        guardar=new JMenuItem("Guardar");
        guardarComo=new JMenuItem("Guardar como");
        salir=new JMenuItem("Salir");

        ayuda=new JMenu("Ayuda");
        acercaDe=new JMenuItem("Acerca de..");

        edicion=new JMenu("Edición");
        copiar=new JMenuItem("Copiar");
        cortar=new JMenuItem("Cortar");
        pegar=new JMenuItem("Pegar");

        formato=new JMenu("Formato");
        ajusteLinea=new JCheckBoxMenuItem("Ajuste de linea");

        vista=new JMenu("Vista");
        numeroLinea=new JCheckBoxMenuItem("Numero de linea");

        ajusteLinea.addChangeListener(evt -> ajusteLineaStateChanged(evt));

        //botones
        btnAbrir.addActionListener(this);
        btnNuevo.addActionListener(this);
        btnGuardar.addActionListener(this);
        btnCompilar.addActionListener(this);
        btnTree.addActionListener(this);
        //opciones de menu
        abrir.addActionListener(this);
        nuevo.addActionListener(this);
        guardar.addActionListener(this);
        guardarComo.addActionListener(this);
        salir.addActionListener(this);

        copiar.addActionListener(this);
        cortar.addActionListener(this);
        pegar.addActionListener(this);
        acercaDe.addActionListener(this);

        //Jerarquia
        archivo.add(abrir);
        archivo.add(nuevo);
        archivo.add(guardar);
        archivo.add(guardarComo);
        archivo.add(salir);

        ayuda.add(acercaDe);

        edicion.add(copiar);
        edicion.add(cortar);
        edicion.add(pegar);

        formato.add(ajusteLinea);

        vista.add(numeroLinea);
        menuBar.add(archivo);
        menuBar.add(edicion);
        menuBar.add(formato);
        menuBar.add(vista);
        menuBar.add(ayuda);
    }
    public static void main(String [] args) {

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");//nimbus
        }
        catch (Exception e){
            e.printStackTrace();
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    private void initComponents() {
        this.setContentPane(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setJMenuBar(menuBar);
        this.setExtendedState(Frame.MAXIMIZED_BOTH);
        this.setMinimumSize(new Dimension(500,500));
        tabbedPane.addTab("Untilled", null,new TabPanel(information), null);
        tabbedPane.addTab(" + ", null,new TabPanel(information), null);
        tabbedPane.addChangeListener(evt -> {
            JTabbedPane tabbedPane = (JTabbedPane)evt.getSource();
            if(tabbedPane.getSelectedIndex() == tabbedPane.getTabCount()-1)
            {
                if(tabbedPane.getTabCount()<22){
                    createTab();
                }else{
                    JOptionPane.showMessageDialog(this, "Maxima cantidad de tabs.");
                    tabbedPane.setSelectedIndex(tabbedPane.getTabCount()-2);
                }
            }
        });
    }
    private void createTab() {
        tabbedPane.setTitleAt(tab,"Untilled");
        tabbedPane.addTab("+",new TabPanel(information));
        tabbedPane.setSelectedIndex(tab);
        tab++;
    }



    private JTextArea codigoTabSelected(){
        JPanel panel = (JPanel)tabbedPane.getComponentAt(tabbedPane.getSelectedIndex());
        //System.out.println(panel.getComponentCount());
        JScrollPane scrollPane=(JScrollPane)panel.getComponent(0);
        //System.out.println(scrollPane.getComponentCount());
        JViewport viewport = scrollPane.getViewport();
        JPanel subPanel=(JPanel) viewport.getView();
        //System.out.println(subPanel.getComponentCount());
        return (JTextArea) subPanel.getComponent(1);
    }
    private JTextArea numerosLineaTabSelected(){
        JPanel panel = (JPanel)tabbedPane.getComponentAt(tabbedPane.getSelectedIndex());
        //System.out.println(panel.getComponentCount());
        JScrollPane scrollPane=(JScrollPane)panel.getComponent(0);
        //System.out.println(scrollPane.getComponentCount());
        JViewport viewport = scrollPane.getViewport();
        JPanel subPanel=(JPanel) viewport.getView();
        JPanel subSubPanel=(JPanel) subPanel.getComponent(0);
        return (JTextArea) subSubPanel.getComponent(0);
    }
    @Override
    public void actionPerformed(ActionEvent e) {


        //Abrir archivo
        ANTLRInputStream input = new ANTLRInputStream(codigoTabSelected().getText());
        scanner = new Scanner( input);
        scanner.removeErrorListeners();
        scanner.addErrorListener(new MyConsoleErrorListener(list));
        CommonTokenStream token = new CommonTokenStream( scanner );
        parser = new MyParser(token);
        parser.removeErrorListeners();
        parser.addErrorListener( new MyBaseErrorListener( list ) );
        parser.setErrorHandler( new MyException( list ) );


        if (e.getSource() == abrir || e.getSource() == btnAbrir) {
            try {
                file = new Archivos();
                codigoTabSelected().setText(file.abrirArchivo());
                guardaFilas();
                poneNumLineas();
                tabbedPane.setTitleAt(tabbedPane.getSelectedIndex(), file.getNombreArchivo());
                abierto++;
            } catch (IOException ex) {
                Logger.getLogger( Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (e.getSource() == guardar || e.getSource() == btnGuardar) {
            try{
                String titulo = tabbedPane.getTitleAt(tabbedPane.getSelectedIndex());
                if (titulo.equalsIgnoreCase("Untilled")) {
                    guardarViejo();
                } else {
                    guardarNuevo();
                }
                guardado++;
            }catch (NullPointerException n){

            }

        } else if (e.getSource() == nuevo || e.getSource() == btnNuevo) {
            //Archivo nuevo
            if (codigoTabSelected().getText().isEmpty()) {//En caso de que el area de texto esté vacia
                tabbedPane.setTitleAt(tabbedPane.getSelectedIndex(),"Untilled");
                guardado = 0;
            } else {//Si existe texto en el area de texto
                String titulo = tabbedPane.getTitleAt(tabbedPane.getSelectedIndex());
                //String l = titulo.substring(0, titulo.length() - 1);
                if (titulo.equalsIgnoreCase("Untilled") || guardado > 0) {
                    int p = JOptionPane.showConfirmDialog(null, "¿Desea guardar los cambios?"
                            , "Guardar", JOptionPane.YES_NO_OPTION);
                    if (p == JOptionPane.YES_OPTION) {
                        if (titulo.equalsIgnoreCase("Untilled")) {
                            guardarViejo();
                        } else {
                            guardarNuevo();
                        }
                    }
                    codigoTabSelected().setText(null);
                    tabbedPane.setTitleAt(tabbedPane.getSelectedIndex(),"Untilled");
                    this.guardado = 0;
                } else if (abierto > 0) {
                    numLineas = 1;
                    codigoTabSelected().setText(null);
                    numerosLineaTabSelected().setText(null);
                    numerosLineaTabSelected().append(numLineas + "\n");
                    tabbedPane.setTitleAt(tabbedPane.getSelectedIndex(),"Untilled");
                    guardado = 0;
                    abierto = 0;
                }
            }
            numHoja = numHoja + 1;
        } else if (e.getSource() == guardarComo) {
            try {
                guardarViejo();
                guardado++;
            }catch (NullPointerException n){}

        } else if (e.getSource() == salir) {
            System.exit(0);
        } else if (e.getSource() == copiar ) {
            codigoTabSelected().copy();
        } else if (e.getSource() == cortar ) {
            codigoTabSelected().cut();
        } else if (e.getSource() == pegar) {
            codigoTabSelected().paste();
        } else if (e.getSource() == acercaDe) {
            JOptionPane.showMessageDialog(this,"No disponible");
        }else if (e.getSource()==btnCompilar){


            DefaultListModel defaultListModel=(DefaultListModel) list.getModel();
            String Mymsg="----------------------------------------------------";
            try {

                parser.program();
                scanner.reset();//para que vuelva a llenar los tokens, porque el parser los consumio
                List<Token> lista = (List<Token>) scanner.getAllTokens();

                for (Token t : lista)
                   defaultListModel.addElement(scanner.VOCABULARY.getSymbolicName(t.getType()) + ":" + t.getText() + "\n");


                /*
                if(list.getModel().getSize()>contError){
                    JOptionPane.showMessageDialog(this,"Error de compilación","",JOptionPane.ERROR_MESSAGE);
                    defaultListModel.addElement(Mymsg);
                    contError=list.getModel().getSize();
                    return;
                }*/
                JOptionPane.showMessageDialog(this,"Fin de compilación.");
                defaultListModel.addElement(Mymsg);
                contError=list.getModel().getSize();
            }
            catch(Exception ex){
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this,"Error de compilación","",JOptionPane.ERROR_MESSAGE);

            }
        }
        else if(e.getSource()==btnTree){
            //
        }
    }
    //En este método, cada fila del editor se va guardando en un vector
    public void guardaFilas() {
        filas = new Vector<String>();
        StringTokenizer st = new StringTokenizer(codigoTabSelected().getText(), "\n");
        while (st.hasMoreTokens()) {
            filas.add(st.nextToken());
        }
    }

    //genera los numeros de linea del editor, se utiliza principalmente para cuando se abre un archivo
    public void poneNumLineas() {
        this.numLineas=1;
        for (String s : filas) {
            numLineas++;
            numerosLineaTabSelected().append(numLineas + "\n");
        }
    }
    //Guardar solicitando nombre
    private void guardarViejo() {
        String s = codigoTabSelected().getText();
        try {
            file = new Archivos();
            file.crearArchivo(s);
            tabbedPane.setTitleAt(tabbedPane.getSelectedIndex(), file.getNombreArchivo());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error de E/S");
        }
    }
    //Guardar sin solicitar el nombre
    private void guardarNuevo() {
        String s = codigoTabSelected().getText();
        try {
            file.crearArchivoUno(s, file.getNombreArchivo());
            tabbedPane.setTitleAt(tabbedPane.getSelectedIndex(), file.getNombreArchivo());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error de E/S");
        }
    }

    //Declaracón de componentes
    private JPanel panel;
    private JButton btnNuevo;
    private JButton btnGuardar;
    private JButton btnAbrir;
    private JButton btnCompilar;
    private JPanel panelCentral;
    private JTabbedPane tabbedPane;
    private JLabel information;
    private JButton btnTree;
    private JList list;
}
