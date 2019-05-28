/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import clases.cliente;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class daoCliente {
private ArrayList<cliente>cli;
private String Archivo;
public daoCliente(String Archivo){
    cli = new ArrayList<cliente>();
    this.Archivo=Archivo;
    cargar();
}
//Agregar Elementos a la lista  - coleccion
    public void adicionar(cliente a){
       cli.add(a);
    }
    //Obtener elementos de la lista
    public cliente obtener(int i){
       return cli.get(i);
    }
    //Eliminar un objeto
    public void eliminar(cliente a){
        cli.remove(a);
    }
    //El tamaño total de los elementos de la lista
    public int tamaño(){
      return cli.size();
    }
    public cliente buscar(String nom){
        for(cliente obj:cli){
            if(nom.equals(obj.getEmpresa()))
                return obj;
        }
        return null;
    }
    /*Implementar Archivos*/
    public void grabar(){
      try{  
         PrintWriter pw;
         String linea;
         pw = new PrintWriter(new FileWriter(Archivo));         
         for(cliente obj:cli){
             linea = (obj.getEmpresa() + ";"+
                      obj.getRuc()+";"+ obj.getDir()
                     );
             pw.println(linea); 
         }  
         pw.close();
      }
      catch(Exception e){
         System.out.println(e.getMessage());
      }      
    }
   
    public void cargar(){
    try{
       BufferedReader br;
       String linea = null;
       String[] array = null;
       br = new BufferedReader(new FileReader(Archivo));
       
       while((linea = br.readLine())!= null){
         array = linea.split(";");
         cliente a = new cliente (array[0].trim(),
                                  Integer.parseInt(array[1].trim()),array[2].trim())
                               ;
         adicionar(a);
       }
       br.close();
    }
    catch(Exception e){
      System.out.println(e.getMessage());
    }
    }
}


