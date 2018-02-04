/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dca
 */
public class MainArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        GuardarArchivo guardarArchivo = new GuardarArchivo();
        guardarArchivo.guardarArchivo();
        
        LeerArchivo leerarchivo = new LeerArchivo();
        leerarchivo.leerArchivo();
        
        
 
        }
    }
    
