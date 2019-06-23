/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import clases.empleado;
import clases.pedido;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author johan07
 */
public class daoPedido {
    private ArrayList<pedido> ped;

    public daoPedido() {
        ped= new ArrayList<pedido>();
    }
    
    public void adicionar(pedido a){
       ped.add(a);
    }
    //Obtener elementos de la lista
    public pedido obtener(int i){
       return ped.get(i);
    }
    //Eliminar un objeto
    public void eliminar(pedido a){
        ped.remove(a);
    }
    //El tamaño total de los elementos de la lista
    public int tamaño(){
      return ped.size();
    }
    
    public void cargar_tabla_pedido(DefaultTableModel dtmtable,JTable jm) {
        
        if (tamaño()==0) {
            JOptionPane.showMessageDialog(null,"Lista sin elementos!!!", "Validar", 2);
        } else {
            dtmtable.setRowCount(0);//Limpia las filas del JTable
            for (pedido p:ped) {
                Object vec[] = new Object[5];
                vec[0] = p.getPLATO();
                vec[1] = p.getCANTIDAD();
                vec[2] = p.getDESCRIPCION();
                vec[3] = p.getPRECIO();
                vec[4] = p.getIMPORTE();
                //agregar al JTable
                dtmtable.addRow(vec);
            }
            
            jm.setModel(dtmtable);
        }

    }
    
       
}