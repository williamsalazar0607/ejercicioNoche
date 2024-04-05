/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frutas;
import javax.swing.JOptionPane;
/**
 *
 * @author willi
 */
public class Frutas {
    
    final double precio = 4200;
    private int numKilo;
    private double totalApagar;

    public Frutas(int numKilo) {
        this.numKilo = numKilo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumKilo() {
        return numKilo;
    }
    
    public double calcularTotal(int numKilo){
        double valor1;
        double valor2;
        
        if(numKilo>0 && numKilo<=2){
            totalApagar=precio*numKilo;
    }
        else if(numKilo>2 && numKilo<=5){
            valor1=(precio*numKilo)*10/100;
            totalApagar=(precio*numKilo)-valor1;
        }
        else if(numKilo>5 && numKilo<=10)
        {
            valor1=(precio*numKilo)*15/100;
            totalApagar=(precio*numKilo)-valor1;
        }else{
              valor1=(precio*numKilo)*20/100;
            totalApagar=(precio*numKilo)-valor1;
        }
            
            return totalApagar;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String numstrg = JOptionPane.showInputDialog("ingresar kilos");
        int numInt = Integer.parseInt(numstrg);
        Frutas cliente = new Frutas (numInt);
        JOptionPane.showMessageDialog(null, "la compra de "+ numInt + " kilos tiene un valor de  "+cliente.precio*cliente. +cliente.calcularTotal(numInt));
    }
    
}
