
package Modelo;

import javax.swing.filechooser.FileFilter;
import java.io.File;


public class FiltroArchivo extends FileFilter {

  //Este método sirve para en el cuadro de abrir o guardar se muestren archivos solo de extension .txt y los directorios
    @Override
    public boolean accept(File f) {
        if (f.getPath().endsWith(".txt")) {
            return true;
        } else if (f.isDirectory()) {
            return true;
        } else {
            return false;
        }
    }
 //Este método sirve para ubicar la descripción en el cuadro de abrir o guardar
    @Override
    public String getDescription() {
        return "Archivo *.txt";
    }
}
