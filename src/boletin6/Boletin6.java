package boletin6;

import javax.swing.JOptionPane;

/**
 *
 * @author avazquezsuarez
 */
public class Boletin6 {

    public static void main(String[] args) {
       String nombre,cuenta;
       double dinerosacado,saldo;
       
       nombre= JOptionPane.showInputDialog("Escriba el nombre del titular: ");
       cuenta= JOptionPane.showInputDialog("Escriba el nº de cuenta: ");
       dinerosacado= Double.parseDouble(JOptionPane.showInputDialog("Escriba el dinero que desea retirar: "));
       saldo= Double.parseDouble(JOptionPane.showInputDialog("Escriba el saldo inicial: "));
               
       Conta cuenta1= new Conta();
       cuenta1.setNome(nombre);
       cuenta1.setSaldo(4587);
       cuenta1.setSaldo(saldo);
       cuenta1.setNumero_conta(cuenta);
       cuenta1.Retirar((int) dinerosacado);
       cuenta1.visulizar();
       
       
    }
    
}
