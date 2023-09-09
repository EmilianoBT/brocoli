/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.brocoli.negocio;

/**
 *
 * @author emili
 */
public class Operacion { 
    
    /*
    Prepara una cadena de texto a partir de una cadena de la expresion guion medio.
    @param Valor cadena de texto que sera separada a partir de la expresion dada.
    @return Array de string en donde cada posicion respresenta una division de la cadena de texto.
    */
   
  public String[] separar(String valor){
    String[] elementos = valor.split("-");
    return elementos;
}
}
