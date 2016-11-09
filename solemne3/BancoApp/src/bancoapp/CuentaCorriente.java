package bancoapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leica
 */
public class CuentaCorriente {
    private Titular titular;
    private String numCuenta;
    private double saldo;
    
    public CuentaCorriente()
    {
        this.titular.setNombre("");
        this.titular.setApellidos("");
        this.titular.setEdad(0);
        this.numCuenta = "";
        this.saldo = 0.0;
    }
    
    public CuentaCorriente(Titular titular, String numCuenta, double saldo)
    {
        this.titular = titular;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }
    
    public CuentaCorriente(Titular titular, String numCuenta)
    {
        this.titular = titular;
        this.numCuenta = numCuenta;
        this.saldo = 15.3;
    }
    
    public Titular getTitular()
    {
        return this.titular;
    }
    
    public String getNumCuenta()
    {
        return this.numCuenta;
    }

    public double getSaldo()
    {
        return this.saldo;
    }
    
    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }
    
    public void incrementSaldo(double increment)
    {
        this.saldo = this.saldo + increment;
    }
    
    public void decrementSaldo(double decrement)
    {
        this.saldo = this.saldo - decrement;
    }
    
    public void printCuenta()
    {
        System.out.println("Num cuenta: " + this.numCuenta + "\n Saldo: " + this.saldo);
    }
    
    public boolean compareToCuenta(Cuenta otraCuenta)
    {
        return this.numCuenta.equals(otraCuenta.numCuenta); 
    }
    
    public void printTitular()
    {
        this.titular.printDatos();
    }
    
}
