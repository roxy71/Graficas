/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficas;
//PASO 1 - IMPORTAR LIBRERIAS GRAFICAS
import javax.swing.*;//Libreria gràfics estandar multiplataforma
import java.awt.*;//Libreria Gràfica del Sistema Operativo
//PASO 8 - IMPORTAR LA CLASE QUE CONTIENE LA GUI
import gui.MiVentana;//Paquete.clase
/**
 *
 * @author LAB03
 */
public class Graficas {

    /**
     * @param args the command line arguments
     */
    //PASO 9 - LLAMADO A LA CLASE
    public static void main(String[] args) 
    {
        MiVentana miventana = new MiVentana();//Creamos un objeto tipo JFrame
        miventana.setVisible(true);//Esta sentencia muestra la ventana
        miventana.setBounds(0, 0, 400, 400);//Le asignamos tamaño a la ventana
        miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Esta sentencia  cierra la ventana
    }
    
}
