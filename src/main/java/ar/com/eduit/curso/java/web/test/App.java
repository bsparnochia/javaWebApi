/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.eduit.curso.java.web.test;

/**
 *
 * @author Brian
 */
public class App {
    public static void main(String[] args) {
        try(Lector lector=new Lector()){ //Try with Resources 
            System.out.println(lector.Leer());
        }catch(Exception e){
        }
    }
}
