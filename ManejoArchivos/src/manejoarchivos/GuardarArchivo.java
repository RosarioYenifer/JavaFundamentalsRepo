/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author dca
 */
public class GuardarArchivo {
    public void guardarArchivo() {
        
       String file = "C:\\manejoArchivos\\index1.txt";
        
        try (FileOutputStream fos = new FileOutputStream(file)){
    
        fos.write(82);
        fos.close();
        }catch (FileNotFoundException ffe){
            ffe.printStackTrace();
        }catch (IOException ie){
            ie.printStackTrace();
        }
    }
    
}

