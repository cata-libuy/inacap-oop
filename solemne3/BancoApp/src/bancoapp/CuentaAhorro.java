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
public class CuentaAhorro extends CuentaCorriente {
    private double interes;
    
    CuentaAhorro()
    {
        super();
        this.interes = 0.0;
    }
    
    CuentaAhorro(Titular titular, String numCuenta, double saldo, double interes)
    {
        super(titular, numCuenta, saldo);
        this.interes = interes;
    }

    CuentaAhorro(Titular titular, String numCuenta, double interes)
    {
        super(titular, numCuenta, 15.3);
        this.interes = interes;
    }
    
    CuentaAhorro(Titular titular, String numCuenta)
    {
        super(titular, numCuenta, 15.3);
        this.interes = 2.5;
    }
    
    public Titular getTitular()
    {
        return super.getTitular();
    }
    
    public String getNumCuenta()
    {
        return super.getNumCuenta();
    }

    public double getSaldo()
    {
        return super.getSaldo();
    }
    
    public double getInteres()
    {
        return this.interes;
    }
    
    public void calcularInteres()
    {
        double interesAgregado = super.getSaldo() * this.interes;
        super.incrementSaldo(interesAgregado);
    }
}
