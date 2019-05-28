
package dao;
import clases.producto;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class daoProducto {
private ArrayList<producto>prod;
private String Archivo;
public daoProducto(String Archivo){
    prod = new ArrayList<producto>();
    this.Archivo=Archivo;
    cargar();
}
 //Agregar Elementos a la lista  - coleccion
    public void adicionar(producto a){
       prod.add(a);
    }
    //Obtener elementos de la lista
    public producto obtener(int i){
       return prod.get(i);
    }
    //Eliminar un objeto
    public void eliminar(producto a){
        prod.remove(a);
    }
    //El tamaño total de los elementos de la lista
    public int tamaño(){
      return prod.size();
    }
    //Buscar por nombre
    public producto buscar(String nom){
        for(producto obj:prod){
            if(nom.equalsIgnoreCase(obj.getProd()))
                return obj;
        }
        return null;
    }
    /*Correlativo*/
    public int getCorrelativo(){
       /*ArrayList vacio  1  2  3  4*/
       if(tamaño() == 0)
           return 1;
       else{
          return tamaño() + 1;
       }
    }
     /*Implementar Archivos*/
    public void grabar(){
      try{  
         PrintWriter pw;
         String linea;
         pw = new PrintWriter(new FileWriter(Archivo));         
         for(int i=0;i<tamaño();i++){
             linea = (prod.get(i).getCod() + ";" +
                      obtener(i).getProd() + ";" +
                      obtener(i).getPrec() + ";" +
                      obtener(i).getCant()
                     );
             pw.println(linea); 
         }  
         pw.close();
      }
      catch(Exception e){
         System.out.println(e.getMessage());
      }      
    }
       public void listar(DefaultTableModel dtm, JTable t){
      dtm.setRowCount(0);
      for(producto obj:prod){
          Object vec[] = new Object[4];
          vec[0]=obj.getCod();
          vec[1]=obj.getProd();
          vec[2]=obj.getPrec();
          vec[3]=obj.getCant();
          dtm.addRow(vec);
      }
      t.setModel(dtm);      
    }
    public void cargar(){
    try{
       BufferedReader br;
       String linea = null;
       String[] array = null;
       br = new BufferedReader(new FileReader(Archivo));
       
       while((linea = br.readLine())!= null){
         array = linea.split(";");
         producto a = new producto(Integer.parseInt(array[0].trim()),
                               array[1].trim(),Double.parseDouble(array[2].trim()),
                               Integer.parseInt(array[3].trim()))
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
