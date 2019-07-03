/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author Luigi
 */
public class Validar {
    
    public static final String TEXTO = "[a-zA-ZáéíóúñüÁÉÍÓÚÑÜ\\s]{2,200}";
    public static final String DNI = "[0-9]{8,11}";
    public static final String CARNET = "[0-9]{9}";
    public static final String RUC = "[0-9]{11}";
    public static final String PASAPORTE = "[A-Z]{2}\\d{10}";
    public static final String NUM_HIJOS = "[0-9]|[1][0]";
    public static final String SUELDO = "(\\d+)|(\\d+[.]\\d{1,2})";
    public static final String PLACA = "[A-Z]{2}\\d{4}";
    public static final String STOCK = "\\d+";
    public static final String FECHA = "((19|20)\\d\\d)[-/](0?[1-9]|1[012])[-/](0?[1-9]|[12][0-9]|3[01])";
    public static final String CORREO = "[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})"; 
    public static final String FONO = "[0-9]{9}";
    public static final String ACTIVIDAD ="[a-zA-Z\t\t]{2,50}";
    public static final String LUGAR ="[a-zA-Z\t\t]{2,50}";
    public static final String DIRECCION ="[a-zA-Z\t\t]{2,50}";
    public static final String  DISTRITO ="[a-zA-Z\t\t]{2,50}";
    public static final String  PROVINCIA ="[a-zA-Z\t\t]{2,50}";
    public static final String  DEPARTAMENTO ="[a-zA-Z\t\t]{2,50}";
    
    
}
