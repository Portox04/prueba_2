/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba_2;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author porto
 */
public class Products {
    
    private String[] dia;
    private String[] product;
    private int[][] sells;

/**
 * Metodo para agregar los productos al arreglo
 * de Objetos
 * @param n es la cantidad de productos que eligio el usuario
 * @return Retorna la matrix con dichos productos
 */
    public static String[] productsAdd(int n) {
        String productsTemp[] = new String[n];
        for (int i = 1; i < n+1; i++) {
            String products = JOptionPane.showInputDialog("Ingresa el nombre del producto "+i+" :");
            productsTemp[i]=products;
                    
        }
        return productsTemp;
    }
    
    
    
/**
 * Setear lo dias en la matrix
 * @return 
 */
    public static String[] setUpDays(){
        String array[] = new String[7];
        array[0] = "Lunes";
        array[1] = "Martes";
        array[2] = "Miercoles";
        array[3] = "Jueves";
        array[4] = "Viernes";        
        array[5] = "Sabado";
        array[6] = "Domingo";
        return array;
    }
    
    
    /**
     * Metodo para poder colocar un numero random 
     * en cada lugar de matriz
     * @param n
     * @return 
     */
    public static int[][] randomNums(int n){
        int array [][] = new int[n][7];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 7; j++) {
                Random rand = new Random();
                int num = rand.nextInt(9);
                array[i][j]= num;
            }
        }
        return array;
    }
    
    
    
   
    public String[] getDia() {
        return dia;
    }

    public void setDia(String[] dia) {
        this.dia = dia;
    }

    public String[] getProduct() {
        return product;
    }

    public void setProduct(String[] product) {
        this.product = product;
    }

    public int[][] getSells() {
        return sells;
    }

    public void setSells(int[][] sells) {
        this.sells = sells;
    }
    
    
    

}
