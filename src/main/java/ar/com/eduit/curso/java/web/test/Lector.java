/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.eduit.curso.java.web.test;

import java.io.Closeable;
import java.io.IOException;

/**
 *
 * @author Brian
 */
public class Lector implements Closeable{

public Lector(){
    
}

public String Leer(){
    return "texto";
}

@Override
public void close() throws IOException{
System.out.println("Se cerro el lector");
}
    
}
