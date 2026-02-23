/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cuentas;

/**
 * Clase principal que ejecuta la aplicación
 * y realiza operaciones sobre un objeto CCuenta
 * @author Daniel
 */

public class Main {

    /**
     * Método principal de ejecución del programa
     * @param args 
     */
    
    public static void main(String[] args) {
        CCuenta cuenta1;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        
        
        operativa_cuenta(cuenta1, 695);
    }

    /**
     * Realiza las operaciones sobre la cuenta bancaria
     * muestra el saldo actual, retira una cantidad 
     * ingresando una cantidad
     * 
     * @param cuenta1 Objeto cuenta sobre el que se trabaja
     * @param cantidad Cantidad a ingresar
     */
    private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        double saldoActual;
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
