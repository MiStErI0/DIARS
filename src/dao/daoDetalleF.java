
package dao;

import clases.detalleFactura;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Josias
 */
public class daoDetalleF {
    
    List<detalleFactura> detalle;
    String Archivo;//Nombre del Archivo
    public daoDetalleF(String Archivo){
      detalle = new ArrayList<detalleFactura>();
      this.Archivo = Archivo;
      cargar();
    }
    //Agregar Elementos a la lista  - coleccion
    public void adicionar(detalleFactura e){
       detalle.add(e);
    }
    //Obtener elementos de la lista
    public detalleFactura obtener(int i){
       return detalle.get(i);
    }
    //Eliminar un objeto
    public void eliminar(detalleFactura e){
        detalle.remove(e);
    }
    //El tamaño total de los elementos de la lista
    public int tamaño(){
      return detalle.size();
    }

    //Metodo para buscar objetos por codigo
    public detalleFactura buscardDetalle(int cod){
        for(int i=0;i<tamaño();i++){
            if(detalle.get(i).getCodDetalle()==cod){
                return detalle.get(i);
            }
        }
        return null;
    }
    public int CorrelativoAcc(){
       /*ArrayList vacio  1  2  3  4*/
       if(tamaño() == 0)
           return 1;
       else{
          return obtener(tamaño() - 1).getCodDetalle()+ 1;
       }
    }
    public void listar(JTable t,DefaultTableModel dtm){
      dtm.setRowCount(0);
       for(detalleFactura obj:detalle){
          Object vec[]=new Object[7];
          vec[0]    =   obj.getCodDetalle();
          vec[1]    =   obj.getCodProd();
          vec[2]    =   obj.getCantidad();
          vec[3]    =   obj.getPrecioUnidad();
          vec[4]    =   obj.getSubTotal();
          vec[5]    =   obj.getIgv();
          vec[6]    =   obj.getTotalPago();
          dtm.addRow(vec);
       }
       t.setModel(dtm);
    }
     /*Implementar Archivos*/
    public void grabar(){
      try{  
         PrintWriter pw;
         String linea;
         pw = new PrintWriter(new FileWriter(Archivo));         
         for(detalleFactura obj:detalle){
             linea = (obj.getCodDetalle() + ";" +
                      obj.getCodProd() + ";" +
                     obj.getCantidad() + ";" +
                     obj.getPrecioUnidad()+ ";" +
                     obj.getSubTotal()+ ";" +
                     obj.getIgv()+ ";" +
                     obj.getTotalPago());
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
         detalleFactura c = new detalleFactura(Integer.parseInt(array[0].trim()),
                               Integer.parseInt(array[1].trim()),
                               Integer.parseInt(array[2].trim()), 
                               Double.parseDouble(array[3].trim()),
                               Double.parseDouble(array[4].trim()),
                               Double.parseDouble(array[5].trim()),
                               Double.parseDouble(array[6].trim()) 
                               );
         adicionar(c);
       }
       br.close();
    }
    catch(Exception e){
      System.out.println(e.getMessage());
    }
    }    
}
