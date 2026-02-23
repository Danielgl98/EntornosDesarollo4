/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cuentas;

/**
 * Clase que representa una cuenta bancaria
 * permite el ingreso y la retirada de dinero
 * y también consultar el estado de la cuenta
 * 
 * @author Daniel
 */

public class CCuenta {

    /**
     * Nombre del titular de la cuenta bancaria
     */
    private String nombre;
    
    /**
     * Número de la cuenta bancaria
     */
    private String cuenta;
    
    /**
     * Saldo actual disponible en la cuenta
     */
    private double saldo;
    
    /**
     * Tipo de interés aplicado en la cuenta
     */
    private double tipoInteres;


    /**
     * Constructor por defecto
     */
    
    public CCuenta()
    {
    }

    /**
     * Constructor que tiene parametros para crear la cuenta
     * 
     * @param nom nombre del titular
     * @param cue número de cuenta
     * @param sal saldo disponible
     * @param tipo tipo de interés
     */
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres = tipo;
    }


    /**
     * Devuelve el estado de la cuenta
     * 
     * @return saldo disponible
     */
    
    public double estado()
    {
        return saldo;
    }


    /**
     * Método para ingresar dinero a la cuenta
     * 
     * @param cantidad dinero a ingresar
     * @throws Exception por si se intenta ingresar una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Método para retirar dinero de la cuenta
     * 
     * @param cantidad dinero a retirar
     * @throws Exception por si la cantidad a retirar es negativa
     * o si la cantidad a retirar es más que el saldo disponible
     */
    
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No hay suficiente saldo");
        saldo = saldo - cantidad;
    }


    /**
     * Devuelve el número de cuenta
     * @return número de cuenta
     */
    public String obtenerCuenta()
    {
        return cuenta;
    }


    /**
     * Devuelve el nombre del titular 
     * 
     * @return nombre
     */
    
    public String getNombre() {
        return nombre;
    }

    /**
     * Asignamos el nombre del titular
     * 
     * @param nombre nombre del titular
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /**
     * Devuelve el tipo de interés de la cuenta bancaria
     * @return Tipo interés
     */
    
    public double getTipoInteres() {
        return tipoInteres;
    }


    /**
     * Asignamos el tipo de interés de la cuenta bancaria
     * @param tipoInteres Interés de la cuenta
     */
    
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
