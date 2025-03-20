/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_2;

import javax.swing.JOptionPane;

/**
 *
 * @author porto
 */
public class Prueba_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Solicitar la cantidad de productos que quiera agregar
        int n = Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad de Productos que quiera agregar:"));
        Products matrix = new Products();
        matrix.setProduct(Products.productsAdd(n));
        matrix.setDia(Products.setUpDays());
        matrix.setSells(Products.randomNums(n));
        
        
        
        
        
        
    }
    
}
